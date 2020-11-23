package by.jonline.progwithclass.aggregationandcompositionеtaskfive;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
питания и числа дней. Реализовать выбор и сортировку путевок.*/

import java.util.Arrays;

public class Tour {

    private String name_of_tour;
    private TypesOfTours tour;
    private String country;
    private TypeOfTransport transport;
    private TypeOfHotel hotel;
    private TypeOfFood meal;
    private int[] number_of_days_nights;

    public Tour(String name_of_tour, TypesOfTours tour, String country, TypeOfTransport transport, TypeOfHotel hotel, TypeOfFood meal, int days, int nights) {
        this.name_of_tour = name_of_tour;
        this.tour = tour;
        this.country = country;
        this.transport = transport;
        this.hotel = hotel;
        this.meal = meal;
        this.number_of_days_nights = new int[]{days, nights};
    }

    public String getName_of_tour() {
        return name_of_tour;
    }

    public void setName_of_tour(String name_of_tour) {
        this.name_of_tour = name_of_tour;
    }

    public TypesOfTours getTour() {
        return tour;
    }

    public void setTour(TypesOfTours tour) {
        this.tour = tour;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public TypeOfTransport getTransport() {
        return transport;
    }

    public void setTransport(TypeOfTransport transport) {
        this.transport = transport;
    }

    public TypeOfHotel getHotel() {
        return hotel;
    }

    public void setHotel(TypeOfHotel hotel) {
        this.hotel = hotel;
    }

    public TypeOfFood getMeal() {
        return meal;
    }

    public void setMeal(TypeOfFood meal) {
        this.meal = meal;
    }

    public int[] getNumber_of_days_nights() {
        return number_of_days_nights;
    }

    public void setNumber_of_days_nights(int days, int nights) {
            this.number_of_days_nights = new int[]{days, nights};
    }

    @Override
    public String toString() {
        return "Tour{" +
                "name_of_tour='" + name_of_tour + '\'' +
                ", tour=" + tour +
                ", country='" + country + '\'' +
                ", transport=" + transport +
                ", hotel=" + hotel +
                ", meal=" + meal +
                ", number_of_days_nights=" + Arrays.toString(number_of_days_nights) +
                '}';
    }
}
