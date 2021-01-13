package by.jonline.task6.task4.view;

import by.jonline.task6.task4.bean.Ship;

public class PortView {
    public void arrivalAtBerth(Ship ship){
        if(ship.getCargo().size() != 0){
            System.out.println("Корабль №: " + ship.getName() + " прибыл к причалу для разгрузки");
        }else {
            System.out.println("Корабль №: " + ship.getName() + " прибыл к причалу для загрузки");
        }

    }

    public void departureShip(Ship ship){
        if(ship.getCargo().size() != 0){
            System.out.println("Корабль №: " + ship.getName() + " Отчалил с грузом -" + ship.getCargo());
        }else {
            System.out.println("Корабль №: " + ship.getName() + " Отчалил без груза");
        }

    }
}
