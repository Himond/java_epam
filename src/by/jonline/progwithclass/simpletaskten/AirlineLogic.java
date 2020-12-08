package by.jonline.progwithclass.simpletaskten;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора
данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import java.text.SimpleDateFormat;
import java.util.*;


public class AirlineLogic {

    //this method returns a list of airplane at the specified destination
    public List<Aircraft> destinationPlane(String destination, List<Aircraft> aircrafts){
        List<Aircraft> list = new ArrayList<>();
        for (Aircraft plane: aircrafts){
            if(plane.getDestination().equals(destination)){
                list.add(plane);
            }
        }
        return list;
    }

    //this method returns a list of planes for the specified departure day
    public List<Aircraft> departureDay(String day_of_week, List<Aircraft> aircrafts){
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE",  Locale.ENGLISH);
        String day;
        List<Aircraft> list = new ArrayList<>();
        for (Aircraft plane:aircrafts){
            day = dateFormat.format(plane.getTime_of_departure().getTime());
            if(day.equals(day_of_week)){
                list.add(plane);
            }
        }
        return list;
    }

    //the overloaded method returns a list of planes on the specified departure day, the departure time for which is greater than the specified one
    public List<Aircraft> departureTime(int hour, int minute, List<Aircraft> aircrafts){
        int a_hour;
        int a_minute;
        List<Aircraft> list = new ArrayList<>();

        for (Aircraft plane: aircrafts){
            a_hour = plane.getTime_of_departure().get(Calendar.HOUR);
            a_minute = plane.getTime_of_departure().get(Calendar.MINUTE);
            if(a_hour >= hour && a_minute >= minute){
                list.add(plane);
            }
        }
        return list;
    }

}
