package by.jonline.task6.task4.logic;

import by.jonline.task6.task4.bean.Ship;
import by.jonline.task6.task4.view.PortView;


public class BerthLoader implements Runnable{

    private final PortLogic logic;
    private final PortView view = new PortView();

    public BerthLoader(PortLogic logic) {
        this.logic = logic;
    }

    @Override
    public void run() {
            Ship ship = logic.getShip();
            view.arrivalAtBerth(ship);
            if(logic.statusFullEmpty(ship)){
                try {
                    logic.loadingShip(ship);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                try {
                    logic.unloadingShip(ship);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            view.departureShip(ship);
    }
}
