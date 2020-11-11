package progwithclasses.simpletaskten;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора
данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.util.ArrayList;
import java.util.Arrays;


public class Airlines {

    private Airline[] airlines;

    public Airlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airlines(Airline airline) {
        ArrayList<Airline> list = new ArrayList<>();
        list.add(airline);
        this.airlines = list.toArray(new Airline[0]);
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    //this method adds an airplane
    public void addAirlines(Airline airline){
        ArrayList<Airline> list = new ArrayList<>(Arrays.asList(this.airlines));
        list.add(airline);
        this.airlines = list.toArray(new Airline[0]);
    }

    //this overloaded method adds a list of airplane
    public void addAirlines(Airline[] airline){
        ArrayList<Airline> list = new ArrayList<>(Arrays.asList(this.airlines));
        list.addAll(Arrays.asList(airline));
        this.airlines = list.toArray(new Airline[0]);
    }

    //this method deletes the specified plane
    public void removeAirline(Airline airline){
        ArrayList<Airline> list = new ArrayList<>(Arrays.asList(this.airlines));
        list.remove(airline);
        this.airlines = list.toArray(new Airline[0]);
    }

    //this method returns a list of airplane at the specified destination
    public ArrayList<Airline> destinationAirplane(String destination){
        ArrayList<Airline> list = new ArrayList<>();
        for (Airline air: this.airlines){
            if(air.getDestination().equals(destination)){
                list.add(air);
            }
        }
        return list;
    }

    //this method returns a list of planes for the specified departure day
    public ArrayList<Airline> weekDayAirplane(String day_of_week){
        ArrayList<Airline> list = new ArrayList<>();
        for (Airline air: this.airlines){
            if(air.getDay_of_week().equals(day_of_week)){
                list.add(air);
            }
        }
        return list;
    }

    //the overloaded method returns a list of planes on the specified departure day, the departure time for which is greater than the specified one
    public ArrayList<Airline> weekDayAirplane(String day_of_week, String time){
        ArrayList<Airline> list = new ArrayList<>();
        for (Airline air: this.airlines){
            if(air.getDay_of_week().equals(day_of_week) && air.getTime_of_departure().compareTo(time) >= 0){
                list.add(air);
            }
        }
        return list;
    }
}
