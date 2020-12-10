package by.jonline.progwithclass.aggregationandcompositionеtaskfive;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
питания и числа дней. Реализовать выбор и сортировку путевок.*/


import java.util.*;
public class TourAgency {

    private String name;
    private List<Tour> tours;

    {
        this.tours = new ArrayList<>();
    }

    public TourAgency() {
    }

    public TourAgency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void addTours(Tour tour) {
        this.tours.add(tour);
    }

    public void removeTours(Tour tour) {
        this.tours.remove(tour);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourAgency that = (TourAgency) o;
        return Objects.equals(name, that.name) && Objects.equals(tours, that.tours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tours);
    }

    @Override
    public String toString() {
        return "TourAgency{" +
                "name='" + name + '\'' +
                ", tours=" + tours +
                '}';
    }
}
