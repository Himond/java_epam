package by.jonline.progwithclass.simpletaskfour;

import java.util.List;

public class TrainView {

    public void print(String message, List<Train> trains){
        System.out.println(message);
        for (Train train: trains) {
            System.out.println(train);
        }
        System.out.println();
    }

    public void print(Train train){
        System.out.println(train);
    }
}
