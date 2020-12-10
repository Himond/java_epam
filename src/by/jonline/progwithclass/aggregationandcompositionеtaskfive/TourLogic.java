package by.jonline.progwithclass.aggregationandcompositionеtaskfive;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
питания и числа дней. Реализовать выбор и сортировку путевок.*/


import java.util.ArrayList;
import java.util.List;

public class TourLogic {

    //список туров по типу
    public List<Tour> choiceTours(TypesOfTours type, List<Tour> tours){
        ArrayList<Tour> choice_tours = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getTour() == type){
                choice_tours.add(tour);
            }
        }
        return choice_tours;
    }

    //список туров по транспорту
    public List<Tour> choiceByTransport(TypeOfTransport transport, List<Tour> tours){
        ArrayList<Tour> choice_tours = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getTransport() == transport){
                choice_tours.add(tour);
            }
        }
        return choice_tours;
    }
    //список туров по  еде
    public List<Tour> choiceByMeal(TypeOfFood food, List<Tour> tours){
        ArrayList<Tour> choice_tours = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getMeal() == food){
                choice_tours.add(tour);
            }
        }
        return choice_tours;
    }

    //список туров по количеству дней
    public List<Tour> choiceByDays(int day, List<Tour> tours){
        ArrayList<Tour> choice_tours = new ArrayList<>();
        for (Tour tour: tours) {
            if (tour.getNumber_of_days() >= day){
                choice_tours.add(tour);
            }
        }
        return choice_tours;
    }

    //сортировка по траспорту
    public List<Tour> sortTourByTransport(List<Tour> tours){
        List<Tour> sortTours = new ArrayList<>(tours);
        int i = 0;
        while (i < sortTours.size() - 1){
            if(sortTours.get(i).getTransport().compareTo(sortTours.get(i + 1).getTransport()) > 0){
                Tour key = sortTours.get(i);
                sortTours.set(i, sortTours.get(i + 1));
                sortTours.set(i + 1, key);
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }
        return sortTours;
    }

    //сортировка по еде
    public List<Tour> sortTourByMeals(List<Tour> tours){
        List<Tour> sortTours = new ArrayList<>(tours);
        int i = 0;
        while (i < sortTours.size() - 1){
            if(sortTours.get(i).getMeal().compareTo(sortTours.get(i + 1).getMeal()) > 0){
                Tour key = sortTours.get(i);
                sortTours.set(i, sortTours.get(i + 1));
                sortTours.set(i + 1, key);
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }
        return sortTours;
    }

    //сортировка по количеству дней
    public List<Tour> sortTourByDays(List<Tour> tours){
        List<Tour> sortTours = new ArrayList<>(tours);
        int i = 0;
        while (i < sortTours.size() - 1){
            if(sortTours.get(i).getNumber_of_days() > sortTours.get(i + 1).getNumber_of_days()){
                Tour key = sortTours.get(i);
                sortTours.set(i, sortTours.get(i + 1));
                sortTours.set(i + 1, key);
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }
        return sortTours;
    }

    //сортировка по типу тура
    public List<Tour> sortTourByType(List<Tour> tours){
        List<Tour> sortTours = new ArrayList<>(tours);
        int i = 0;
        while (i < sortTours.size() - 1){
            if(sortTours.get(i).getTour().compareTo(sortTours.get(i + 1).getTour()) > 0){
                Tour key = sortTours.get(i);
                sortTours.set(i, sortTours.get(i + 1));
                sortTours.set(i + 1, key);
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }
        return sortTours;
    }
}
