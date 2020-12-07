package by.jonline.progwithclass.simpletaskfour;
/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Depo{

    private List<Train> trains;
    private int number;

    {
        this.trains = new ArrayList<>();
    }

    public Depo() {
    }

    public Depo(int number) {
        this.number = number;
    }

    public List<Train> getTrains() {
        return trains;
    }

    public void setTrains(Train train) {
        this.trains.add(train);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Depo depo = (Depo) o;
        return number == depo.number && Objects.equals(trains, depo.trains);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((trains == null) ? 0 : trains.hashCode());
        result = prime * result + number;
        return result;
    }
}
