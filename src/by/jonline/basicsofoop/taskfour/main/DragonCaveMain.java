package by.jonline.basicsofoop.taskfour.main;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и
выбора сокровищ на заданную сумму.*/

import by.jonline.basicsofoop.taskfour.dao.DragonCaveDAOImpl;
import by.jonline.basicsofoop.taskfour.dao.DragonCaveDao;
import by.jonline.basicsofoop.taskfour.view.DragonCaveView;
import by.jonline.basicsofoop.taskfour.logic.DragonCaveLogic;

import java.io.IOException;

public class DragonCaveMain {

    public static void main(String[] args) throws IOException {
        DragonCaveLogic logic = new DragonCaveLogic();
        DragonCaveView view = new DragonCaveView();
        DragonCaveDao dao = new DragonCaveDAOImpl();

        dao.addTreasure("diamonds", 300);
        view.printTreasure("Самое дорогое сокровище:", logic.dearestTreasure());
        view.printTreasure("Сокровища на заданную сумму:", logic.getTreasureForAmount(1250));
        view.printTreasure("Все сокровища:", logic.getAllTreasure());
        view.printTreasure("Сокровище по названию:", logic.getTreasureByName("gold"));

    }

}
