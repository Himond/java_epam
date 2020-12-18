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

import java.util.ArrayList;
import java.util.List;

public class DragonLogic {

    public Treasure dearestTreasure(DragonCave cave){
        Treasure maxCostTreasure = null;
        for (Treasure treasure: cave.getTreasures()){
            if(maxCostTreasure != null){
                if(maxCostTreasure.getCost() < treasure.getCost()){
                    maxCostTreasure = treasure;
                }
            }else{
                maxCostTreasure = treasure;
            }
        }
        return maxCostTreasure;
    }

    public List<Treasure> getTreasureForAmount(int amount, DragonCave cave){
            int result = amount;
            List<Treasure> sumTreasure = new ArrayList<>();
            for(Treasure treasure: cave.getTreasures()){
                if (result - treasure.getCost() >= 0){
                    sumTreasure.add(treasure);
                    result -= treasure.getCost();
                }
            }
            return sumTreasure;
    }


}
