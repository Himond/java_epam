package by.jonline.progwithclass.aggregationandcompositionеtaskfive;

import java.util.List;

public class TourView {
    public  void print(String message, List<Tour> tours){
        System.out.println(message);
        for (Tour tour: tours){
            System.out.println(tour);
        }
        System.out.println();
    }
}
