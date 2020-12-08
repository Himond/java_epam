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
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainAirlines {
    public static void main(String[] args) {
        Airline airline = new Airline();
        AirlineLogic logic = new AirlineLogic();
        AirlineView view = new AirlineView();

        Aircraft aircraft1 = new Aircraft("Хургада",  9207, "Boeing 737-800", new GregorianCalendar(2020, Calendar.AUGUST,17, 4, 20));
        Aircraft aircraft2 = new Aircraft("Стамбул",  783, "Embraer 195", new GregorianCalendar(2020, Calendar.AUGUST, 17, 9, 40));
        Aircraft aircraft3 = new Aircraft("Львов",  827, "Embraer 175", new GregorianCalendar(2020, Calendar.AUGUST, 19, 12, 10));
        Aircraft aircraft4 = new Aircraft("Хургада",  9115, "Boeing 737-800",  new GregorianCalendar(2020, Calendar.AUGUST, 19, 18, 5));

        airline.setAircrafts(aircraft1);
        airline.setAircrafts(aircraft2);
        airline.setAircrafts(aircraft3);
        airline.setAircrafts(aircraft4);

        view.print("список рейсов для заданного пункта назначения: ", logic.destinationPlane("Хургада", airline.getAircrafts()));
        view.print("список рейсов для заданного дня недели: ", logic.departureDay("Monday", airline.getAircrafts()));
        view.print("список рейсов для заданного дня недели, время вылета для которых больше заданного: ", logic.departureTime(8, 0, logic.departureDay("Monday", airline.getAircrafts() )));
    }
}
