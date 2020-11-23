package by.jonline.progwithclass.aggregationandcompositionеtaskfive;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
питания и числа дней. Реализовать выбор и сортировку путевок.*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TourControl {
    
    private Tour[] tours;

    public TourControl(Tour[] tours) {
        this.tours = tours;
    }

    public TourControl(Tour tour) {
        ArrayList<Tour> new_tour = new ArrayList<>();
        new_tour.add(tour);
        this.tours = new_tour.toArray(new Tour[0]);
    }
    
    public void addTour(Tour tour){
        ArrayList<Tour> new_tours = new ArrayList<>(Arrays.asList(tours));
        new_tours.add(tour);
        this.tours = new_tours.toArray(new Tour[0]);
    }
    
    public void removeTour(Tour tour){
        ArrayList<Tour> new_tours = new ArrayList<>(Arrays.asList(tours));
        new_tours.remove(tour);
        this.tours = new_tours.toArray(new Tour[0]);
    }

    public Tour[] getTours() {
        return tours;
    }
    
    public ArrayList<Tour> choiceTours(TypesOfTours type){
        ArrayList<Tour> choice_tours = new ArrayList<>();
        for (Tour tour: getTours()) {
            if (tour.getTour() == type){
                choice_tours.add(tour);
            }
        }
        return choice_tours;
    }

    public ArrayList<Tour> choiceTours(TypesOfTours type, TypeOfTransport transport){
        ArrayList<Tour> choice_tours = new ArrayList<>();
        for (Tour tour: getTours()) {
            if (tour.getTour() == type && tour.getTransport() == transport){
                choice_tours.add(tour);
            }
        }
        return choice_tours;
    }

    public ArrayList<Tour> choiceTours(TypesOfTours type, TypeOfTransport transport, TypeOfFood food){
        ArrayList<Tour> choice_tours = new ArrayList<>();
        for (Tour tour: getTours()) {
            if (tour.getTour() == type && tour.getTransport() == transport && tour.getMeal() == food){
                choice_tours.add(tour);
            }
        }
        return choice_tours;
    }

    public ArrayList<Tour> choiceTours(TypesOfTours type, TypeOfTransport transport, TypeOfFood food, int day){
        ArrayList<Tour> choice_tours = new ArrayList<>();
        for (Tour tour: getTours()) {
            if (tour.getTour() == type && tour.getTransport() == transport && tour.getMeal() == food && tour.getNumber_of_days_nights()[0] == day){
                choice_tours.add(tour);
            }
        }
        return choice_tours;
    }

    public Tour[] sortTourByTransport(){
        Tour[] sort_tours = getTours();
        Arrays.sort(sort_tours, new SortByTransport());
        return sort_tours;
    }

    public Tour[] sortTourByMeals(){
        Tour[] sort_tours = getTours();
        Arrays.sort(sort_tours, new SortByFood());
        return sort_tours;
    }

    public Tour[] sortTourByDays(){
        Tour[] sort_tours = getTours();
        Arrays.sort(sort_tours, new SortByDays());
        return sort_tours;
    }

    public Tour[] sortTour(){
        Tour[] sort_tours = getTours();
        Arrays.sort(sort_tours, new SortByTour());
        return sort_tours;
    }


    private static class SortByTransport implements Comparator<Tour> {
        public int compare(Tour a, Tour b){
            TypeOfTransport firstTour = a.getTransport();
            TypeOfTransport secondTour = b.getTransport();
            return firstTour.compareTo(secondTour);
        }
    }

    private static class SortByFood implements Comparator<Tour> {
        public int compare(Tour a, Tour b){
            TypeOfFood firstTour = a.getMeal();
            TypeOfFood secondTour = b.getMeal();
            return firstTour.compareTo(secondTour);
        }
    }

    private static class SortByDays implements Comparator<Tour> {
        public int compare(Tour a, Tour b){
            return Integer.compare(a.getNumber_of_days_nights()[0], b.getNumber_of_days_nights()[0]);
        }
    }

    private static class SortByTour implements Comparator<Tour> {
        public int compare(Tour a, Tour b){
            TypesOfTours firstTour = a.getTour();
            TypesOfTours secondTour = b.getTour();
            return firstTour.compareTo(secondTour);
        }
    }

    @Override
    public String toString() {
        return "Tours{" +
                "tours=" + Arrays.toString(tours) +
                '}';
    }
}
