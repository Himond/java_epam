package by.jonline.progwithclasses.simpletaskten;

import java.util.Arrays;

public class MainAirlines {
    public static void main(String[] args) {
        Airline airline1 = new Airline("Хургада",  9207, "Boeing 737-800", "04:05", "Monday");
        Airline airline2 = new Airline("Стамбул",  783, "Embraer 195", "09:20", "Monday");
        Airline airline3 = new Airline("Львов",  827, "Embraer 175", "13:10", "Tuesday");
        Airline airline4 = new Airline("Хургада",  9115, "Boeing 737-800", "18:20", "Tuesday");
        AirlineControl airlines = new AirlineControl(airline1);
        System.out.println(Arrays.toString(airlines.getAirlines()));
        airlines.addAirlines(new Airline[]{airline2, airline3, airline4});
        System.out.println(Arrays.toString(airlines.getAirlines()));
        airlines.removeAirline(airline3);
        System.out.println(Arrays.toString(airlines.getAirlines()));
        airlines.addAirlines(airline3);
        System.out.println(Arrays.toString(airlines.getAirlines()));
        System.out.println(airlines.destinationAirplane("Хургада"));
        System.out.println(airlines.weekDayAirplane("Monday"));
        System.out.println(airlines.weekDayAirplane("Monday", "08:00"));
    }
}
