package by.jonline.progwithclass.aggregationandcompositionеtaskthree;

import java.util.List;

public class CountryView {
    public void print(String message, int count){
        System.out.println(message + ": " + count);
    }

    public void print(String message, String city){
        System.out.println(message + ": " + city);
    }

    public void print(String message, List<City> cities){
        System.out.println(message + ": ");
        for (int i = 0; i < cities.size(); i++){
            System.out.println(cities.get(i).getCity_name());
        }
    }
}
