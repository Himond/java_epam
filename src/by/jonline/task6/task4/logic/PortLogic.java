package by.jonline.task6.task4.logic;


import by.jonline.task6.task4.bean.Port;
import by.jonline.task6.task4.bean.SeaСontainer;
import by.jonline.task6.task4.bean.Ship;

import java.util.List;


public class PortLogic{

    private Port port;


    public PortLogic(Port port) {
        this.port = port;
    }

    public int getNumberOfBerth(){
        return port.getNumberOfBerths();
    }
    public List<Ship> getAllShip(){
        return port.getShips();
    }



    //взять корабль в порту для загрузки/выгрузки
    public synchronized Ship getShip(){
        Ship ship = null;
        for (Ship s: port.getShips()){
            ship = s;
            break;
        }
        port.moorShip(ship);
        return ship;
    }

    //проверить сотояние коробля (на погрузку или выгрузку)
    public boolean statusFullEmpty(Ship ship){
        boolean status = true; //пустой корабль (необходима загрузка)
        if (ship.getCargo().size() != 0){
            status = false; //полный корабль(необходима разгрузка)
        }
        return status;
    }

    //разгрузка коробля
    public void unloadingShip(Ship ship) throws InterruptedException {
        SeaСontainer container;
        for (int i = 0; i < ship.getCargo().size(); i++){
            container = ship.getCargo().get(i);
            while (addContainerToPort(container)){
                Thread.sleep(500);
            }
        }
        ship.unloadAllCargo();
    }

    //загрузка коробля
    public void loadingShip(Ship ship) throws InterruptedException {
        while (checkLiftingCapacity(ship)){
            ship.addContainer(getContainerFromPort());
        }
    }



    //взять контейнер из порта
    private synchronized SeaСontainer getContainerFromPort() throws InterruptedException {
        SeaСontainer newContainer = null;
        while (newContainer == null){
            if(port.getCargo().size() != 0){
                for (SeaСontainer container: port.getCargo()){
                    newContainer = container;
                    port.takeContainer(container);
                    break;
                }
            }
            Thread.sleep(500);
        }
        return newContainer;
    }

    //проверить грузоподъемность коробля
    private boolean checkLiftingCapacity(Ship ship){
        boolean check = true;
        int result = 1;
        for (SeaСontainer cont: ship.getCargo()){
            result += cont.getWeight();
        }
        if (result > ship.getLiftingCapacity()){
            check = false;
        }
        return check;
    }


    //погрузить контейнер в порт
    private synchronized boolean addContainerToPort(SeaСontainer container) throws InterruptedException {
        boolean status = true;
        if(port.getCargo().size() < port.getNumberOfContainers()){
            Thread.sleep(500);
            port.addContainer(container);
            status = false;
        }
        return status;
    }



}
