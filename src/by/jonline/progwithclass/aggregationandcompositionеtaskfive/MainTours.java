package by.jonline.progwithclass.aggregationandcompositionеtaskfive;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
питания и числа дней. Реализовать выбор и сортировку путевок.*/

import java.util.Arrays;
import java.util.List;

public class MainTours {
    public static void main(String[] args) {
        TourAgency agency = new TourAgency("Travel House");
        TourLogic logic = new TourLogic();
        TourView view = new TourView();

        Tour tour1 = new Tour("Новый год в загородном комплексе «Раубичи»!", TypesOfTours.SKI_TOUR,
                 TypeOfTransport.WITHOUT_TRANSPORT,  TypeOfFood.WITHOUT_MEALS, 2);
        Tour tour2 = new Tour("Отдых на Чёрном море в Абхазии 2021", TypesOfTours.REST,
                 TypeOfTransport.TRAIN,  TypeOfFood.BREAKFASTS, 11);
        Tour tour3 = new Tour("Великая миграция в Кении Найроби", TypesOfTours.SHOPPING,
                 TypeOfTransport.AIRPLANE, TypeOfFood.FULL_BOARD, 7);
        Tour tour4 = new Tour("Морской круиз Таллин - Хельсинки - Стокгольм", TypesOfTours.CRUISE,
                 TypeOfTransport.SHIP,TypeOfFood.WITHOUT_MEALS, 5);
        Tour tour5 = new Tour(" Шоп тур в Берлин! +2 экскурсии Познань- Потсдам", TypesOfTours.SHOPPING,
                 TypeOfTransport.BUS,  TypeOfFood.BREAKFASTS, 7);
        Tour tour6 = new Tour(" Шоп тур в Минск", TypesOfTours.SHOPPING,
                TypeOfTransport.AIRPLANE, TypeOfFood.HALF_BOARD, 5);

        agency.addTours(tour1);
        agency.addTours(tour2);
        agency.addTours(tour3);
        agency.addTours(tour4);
        agency.addTours(tour5);
        agency.addTours(tour6);


        List<Tour> sortByType = logic.choiceTours(TypesOfTours.SHOPPING, agency.getTours());
        List<Tour> sortByTypeAndTransport = logic.choiceByTransport(TypeOfTransport.AIRPLANE, sortByType);
        List<Tour> sortByTypeAndTransAndMeal = logic.choiceByMeal(TypeOfFood.HALF_BOARD, sortByTypeAndTransport);

        view.print("Выбор туров по типу: ", sortByType);
        view.print("Выбор туров по типу и транспорту: ", sortByTypeAndTransport);
        view.print("Выбор туров по типу и транспорту и еде: ", sortByTypeAndTransAndMeal);

        view.print("Сортировка по типу тура: ", logic.sortTourByType(agency.getTours()));
        view.print("Сортировка по количеству дней: ", logic.sortTourByDays(agency.getTours()));

        view.print("Выбор туров по типу и сортировка их по количеству дней: ", logic.sortTourByDays(sortByType));

    }
}
