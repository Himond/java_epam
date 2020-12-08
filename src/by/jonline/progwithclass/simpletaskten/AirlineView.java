package by.jonline.progwithclass.simpletaskten;

import java.util.List;

public class AirlineView {

    public void print(String message, List<Aircraft> aircrafts){
        System.out.println(message);
        for (Aircraft plain: aircrafts) {
            System.out.println(plain);
        }
    }
}
