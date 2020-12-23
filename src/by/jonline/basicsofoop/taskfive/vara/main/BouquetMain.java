package by.jonline.basicsofoop.taskfive.vara.main;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.*/

import by.jonline.basicsofoop.taskfive.vara.bean.Bouquet;
import by.jonline.basicsofoop.taskfive.vara.bean.Flower;
import by.jonline.basicsofoop.taskfive.vara.bean.Packaging;
import by.jonline.basicsofoop.taskfive.vara.logic.BouquetLogic;
import by.jonline.basicsofoop.taskfive.vara.view.BouquetView;

public class BouquetMain {
    public static void main(String[] args) {

        BouquetLogic logic = new BouquetLogic();
        BouquetView view = new BouquetView();

        Packaging packaging = new Packaging("Blue", "paper", 85);

        Flower rose = logic.createFlower("Rose", "red", 150);
        Flower roseWhite = logic.createFlower("Rose", "white", 170);
        Flower roseYellow = logic.createFlower("Rose", "yellow", 190);
        Flower tulip = logic.createFlower("Tulip", "yellow", 120);
        Flower alstroemeria = logic.createFlower("Alstroemeria", "white", 180);

        Bouquet bouquet = logic.createBouquet(packaging, rose, roseWhite, roseYellow, tulip, alstroemeria);

        view.printBouquet("Содержимое букета: ", bouquet);
        view.printBouquet("Цена букета:", logic.getTotalPrice(bouquet));


    }
}
