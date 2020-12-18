package by.jonline.basicsofoop.taskfour;

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

import java.util.List;

public class DragonView {

    public void printTreasure(String message, DragonCave cave){
        System.out.println(message);
        for (Treasure treasure: cave.getTreasures()){
            System.out.println(treasure.getName() + " " + treasure.getCost());
        }
    }

    public void printTreasure(String message, List<Treasure> treasures){
        System.out.println(message);
        for (Treasure treasure: treasures){
            System.out.println(treasure.getName() + " " + treasure.getCost());
        }
    }

    public void printTreasure(String message, Treasure treasure){
        System.out.println(message);
        System.out.println(treasure.getName() + " " + treasure.getCost());
    }

}
