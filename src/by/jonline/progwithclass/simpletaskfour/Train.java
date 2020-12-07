package by.jonline.progwithclass.simpletaskfour;

/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления
*/

import java.util.Calendar;

public class Train implements Comparable<Train>{

    private String destination;
    private int trainNumber;
    private Calendar departureTime;

    public Train(String destination, int trainNumber, Calendar departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Train other = (Train) obj;
        if(departureTime == null){
            if (other.departureTime != null){
                return false;
            }
        }else if(!departureTime.equals(other.departureTime)){
            return false;
        }
        if (destination == null){
            if (other.destination != null){
                return false;
            }
        }else if(!destination.equals(other.destination)){
            return false;
        }
        if (trainNumber != other.getTrainNumber()){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + trainNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime='" + departureTime.getTime() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Train other) {
        return destination.toLowerCase().compareTo(other.getDestination().toLowerCase());
    }
}
