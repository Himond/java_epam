package by.jonline.progwithclass.simpletaskten;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора
данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.util.Calendar;
import java.util.Objects;

public class Aircraft {
    private String destination;
    private int flight_number;
    private String type_aircraft;
    private Calendar time_of_departure;


    public Aircraft(String destination, int flight_number, String type_aircraft, Calendar time_of_departure) {
        this.destination = destination;
        this.flight_number = flight_number;
        this.type_aircraft = type_aircraft;
        this.time_of_departure = time_of_departure;

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public String getType_aircraft() {
        return type_aircraft;
    }

    public void setType_aircraft(String type_aircraft) {
        this.type_aircraft = type_aircraft;
    }

    public Calendar getTime_of_departure() {
        return time_of_departure;
    }

    public void setTime_of_departure(Calendar time_of_departure) {
        this.time_of_departure = time_of_departure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return flight_number == aircraft.flight_number && Objects.equals(destination, aircraft.destination) && Objects.equals(type_aircraft, aircraft.type_aircraft) && Objects.equals(time_of_departure, aircraft.time_of_departure);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, flight_number, type_aircraft, time_of_departure);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "destination='" + destination + '\'' +
                ", flight_number=" + flight_number +
                ", type_aircraft='" + type_aircraft + '\'' +
                ", time_of_departure=" + time_of_departure.getTime() +
                '}';
    }
}
