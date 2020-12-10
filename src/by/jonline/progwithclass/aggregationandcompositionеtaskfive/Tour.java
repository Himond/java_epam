package by.jonline.progwithclass.aggregationandcompositionеtaskfive;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
питания и числа дней. Реализовать выбор и сортировку путевок.*/

import java.util.Arrays;
import java.util.Objects;

public class Tour {

    private String nameOfTour;
    private TypesOfTours tour;
    private TypeOfTransport transport;
    private TypeOfFood meal;
    private int number_of_days;

    public Tour(String nameOfTour, TypesOfTours tour, TypeOfTransport transport, TypeOfFood meal, int number_of_days) {
        this.nameOfTour = nameOfTour;
        this.tour = tour;
        this.transport = transport;
        this.meal = meal;
        this.number_of_days = number_of_days;
    }

    public String getNameOfTour() {
        return nameOfTour;
    }

    public void setNameOfTour(String nameOfTour) {
        this.nameOfTour = nameOfTour;
    }

    public TypesOfTours getTour() {
        return tour;
    }

    public void setTour(TypesOfTours tour) {
        this.tour = tour;
    }

    public TypeOfTransport getTransport() {
        return transport;
    }

    public void setTransport(TypeOfTransport transport) {
        this.transport = transport;
    }

    public TypeOfFood getMeal() {
        return meal;
    }

    public void setMeal(TypeOfFood meal) {
        this.meal = meal;
    }

    public int getNumber_of_days() {
        return number_of_days;
    }

    public void setNumber_of_days(int number_of_days) {
        this.number_of_days = number_of_days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour1 = (Tour) o;
        return number_of_days == tour1.number_of_days && Objects.equals(nameOfTour, tour1.nameOfTour) && tour == tour1.tour && transport == tour1.transport && meal == tour1.meal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTour, tour, transport, meal, number_of_days);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nameOfTour='" + nameOfTour + '\'' +
                ", tour=" + tour +
                ", transport=" + transport +
                ", meal=" + meal +
                ", number_of_days=" + number_of_days +
                '}';
    }
}
