package by.jonline.progwithclass.simpletaskfour;
import java.util.*;

/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления
*/

public class TrainLogic {

    public List<Train> sortByNumber(List<Train> trains){
        List<Train> sortTrains = new ArrayList<>(trains);
        int i = 0;
        while (i < sortTrains.size() - 1){
            if(sortTrains.get(i).getTrainNumber() > sortTrains.get(i + 1).getTrainNumber()){
                Train key = sortTrains.get(i);
                sortTrains.set(i, sortTrains.get(i + 1));
                sortTrains.set(i + 1, key);
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }
        return sortTrains;
    }


    public Train trainInfo(int number, List<Train> trains){
        Train train = null;
        for (Train value : trains) {
            if (value.getTrainNumber() == number) {
                train = value;
            }
        }
        return train;
    }


    public List<Train> sortDestination(List<Train> trains){
        List<Train> sortTrains = new ArrayList<>(trains);

        Collections.sort(sortTrains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.getDepartureTime().compareTo(o2.getDepartureTime());
            }
        });

        Collections.sort(sortTrains);
        return sortTrains;
    }

}
