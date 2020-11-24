package by.jonline.progwithclass.simpletaskten;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора
данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

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
