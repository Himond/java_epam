package by.jonline.progwithclass.simpletaskten;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора
данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airline {

    private List<Aircraft> aircrafts;

    {
        aircrafts = new ArrayList<>();
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public void setAircrafts(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }

    public void removeAircrafts(Aircraft aircraft){
        this.aircrafts.remove(aircraft);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(aircrafts, airline.aircrafts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aircrafts);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "aircrafts=" + aircrafts +
                '}';
    }
}
