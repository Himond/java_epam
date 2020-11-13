package progwithclasses.aggregationandcompositionеtaskfive;

/*Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
питания и числа дней. Реализовать выбор и сортировку путевок.*/

import java.util.Arrays;

public class MainTours {
    public static void main(String[] args) {
        Tour tour1 = new Tour("Новый год в загородном комплексе «Раубичи»!", TypesOfTours.SKI_TOUR,
                "Belarus", TypeOfTransport.WITHOUT_TRANSPORT, TypeOfHotel.HOTEL_2_STARS, TypeOfFood.WITHOUT_MEALS, 2, 1);
        Tour tour2 = new Tour("Отдых на Чёрном море в Абхазии 2021", TypesOfTours.REST,
                "Abkhazia", TypeOfTransport.TRAIN, TypeOfHotel.HOTEL_3_STARS, TypeOfFood.BREAKFASTS, 11, 10);
        Tour tour3 = new Tour("Великая миграция в Кении Найроби", TypesOfTours.HUNTING_FISHING,
                "Kenya", TypeOfTransport.AIRPLANE, TypeOfHotel.HOTEL_4_STARS, TypeOfFood.FULL_BOARD, 7, 6);
        Tour tour4 = new Tour("Морской круиз Таллин - Хельсинки - Стокгольм", TypesOfTours.CRUISE,
                "Sweden", TypeOfTransport.SHIP, TypeOfHotel.HOTEL_4_STARS, TypeOfFood.WITHOUT_MEALS, 5, 4);
        Tour tour5 = new Tour(" Шоп тур в Берлин! +2 экскурсии Познань- Потсдам", TypesOfTours.SHOPPING,
                "Sweden", TypeOfTransport.BUS, TypeOfHotel.HOTEL_3_STARS, TypeOfFood.BREAKFASTS, 7, 6);
        Tour tour6 = new Tour(" Шоп тур в Берлин! +2 экскурсии Познань- Потсдам", TypesOfTours.SHOPPING,
                "Sweden", TypeOfTransport.AIRPLANE, TypeOfHotel.HOTEL_4_STARS, TypeOfFood.BREAKFASTS, 7, 6);
        Tours tours = new Tours(new Tour[]{tour1, tour2, tour3, tour4, tour6});
        tours.addTour(tour5);
        System.out.println(tours.choiceTours(TypesOfTours.SHOPPING));
        System.out.println(Arrays.toString(tours.sortTour()));
        System.out.println(Arrays.toString(tours.sortTourByTransport()));
        System.out.println(Arrays.toString(tours.sortTourByDays()));

    }
}
