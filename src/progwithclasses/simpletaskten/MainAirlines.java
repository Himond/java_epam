package progwithclasses.simpletaskten;


import java.util.Arrays;

public class MainAirlines {
    public static void main(String[] args) {
        Airline airline1 = new Airline("Хургада",  9207, "Boeing 737-800", "04:05", "Monday");
        Airline airline2 = new Airline("Стамбул",  783, "Embraer 195", "09:20", "Monday");
        Airline airline3 = new Airline("Львов",  827, "Embraer 175", "13:10", "Tuesday");
        Airlines airlines = new Airlines(airline1);
        airlines.addAirlines(new Airline[]{airline2, airline3});
        System.out.println(Arrays.toString(airlines.getAirlines()));
    }
}
