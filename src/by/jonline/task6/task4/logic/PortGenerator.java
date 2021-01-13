package by.jonline.task6.task4.logic;

import by.jonline.task6.task4.bean.Port;
import by.jonline.task6.task4.bean.SeaСontainer;
import by.jonline.task6.task4.bean.Ship;

import java.util.Random;

public class PortGenerator{

    private final int shipCount;
    private int numShip = 1;


    public PortGenerator(int shipCount) {
        this.shipCount = shipCount;
    }


    public void generate(Port port) {
        int countShip = 0;
        int countContainer = 0;
        while (countShip < shipCount){
            port.shipArrivals(genShip());
            countShip++;
        }
        while (countContainer < port.getNumberOfContainers() / 3){
            port.addContainer(genContainer());
            countContainer++;
        }
    }


    private Ship genShip(){
        Random random = new Random();
        int count = 0;
        int rand = random.nextInt(4);
        Ship newShip = new Ship(String.valueOf(numShip), rand + 1);
        numShip++;
        rand = random.nextInt(newShip.getLiftingCapacity());
        while (count < rand){
            newShip.addContainer(genContainer());
            count++;
        }
        return newShip;
    }

    private SeaСontainer genContainer(){
        return new SeaСontainer(1);
    }
}
