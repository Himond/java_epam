package by.jonline.progwithclasses.simpletaskfour;

/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления*/

import java.util.Arrays;

public class MainTrains {
    public static void main(String[] args) {
        Train train1 = new Train("Minsk", 13, "12:00");
        Train train2 = new Train("Kiev", 8, "01:20");
        Train train3 = new Train("Mogilev", 5, "01:29");
        Train train4 = new Train("Minsk", 10, "13:00");
        Train train5 = new Train("Kiev", 2, "01:21");
        TrainControl trainsControl = new TrainControl(new Train[]{train1, train2, train3, train4, train5});
        System.out.println(Arrays.toString(trainsControl.getTrains()));
        System.out.println(trainsControl.sortDestination());
        System.out.println(trainsControl.sortTrainsNumbers());
        System.out.println(trainsControl.trainInfo(13));
    }
}
