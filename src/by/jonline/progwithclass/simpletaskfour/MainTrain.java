package by.jonline.progwithclass.simpletaskfour;

/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления*/


import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainTrain {
    public static void main(String[] args) {

        Depo depo = new Depo(1);
        TrainLogic logic = new TrainLogic();
        TrainView view = new TrainView();

        Train train1 = new Train("Minsk", 13, new GregorianCalendar(2020, Calendar.AUGUST, 21, 12, 50));
        Train train2 = new Train("Kiev", 8, new GregorianCalendar(2020, Calendar.AUGUST, 21, 1, 20));
        Train train3 = new Train("Mogilev", 5, new GregorianCalendar(2020, Calendar.AUGUST, 21, 13, 30));
        Train train4 = new Train("Minsk", 10, new GregorianCalendar(2020, Calendar.AUGUST, 21, 9, 20));
        Train train5 = new Train("Kiev", 2, new GregorianCalendar(2020, Calendar.AUGUST, 18, 22, 10));

        depo.setTrains(train1);
        depo.setTrains(train2);
        depo.setTrains(train3);
        depo.setTrains(train4);
        depo.setTrains(train5);

        view.print("Отсортированные по номеру поезда: ", logic.sortByNumber(depo.getTrains()));
        view.print(logic.trainInfo(13, depo.getTrains()));
        view.print("Отсортированные по пункту назначения поезда: ", logic.sortDestination(depo.getTrains()));


    }
}
