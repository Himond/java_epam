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

public class BouquetMain {
    public static void main(String[] args) {
        BouquetLogic logic = new BouquetLogic();
        Packaging packaging = new Packaging("Blue", "paper", 85);
        Flower rose = Flower.newBuilder().setName("Rose").setColor("Red").setPrice(150).build();
        Flower roseWhite = Flower.newBuilder().setName("Rose").setColor("white").setPrice(170).build();
        Flower roseYellow = Flower.newBuilder().setName("Rose").setColor("yellow").setPrice(190).build();
        Flower tulip = Flower.newBuilder().setName("Tulip").setColor("yellow").setPrice(120).build();
        Flower alstroemeria = Flower.newBuilder().setName("Alstroemeria").setColor("white").setPrice(180).build();
        Bouquet bouquet = logic.createBouquet(packaging, rose, roseWhite, roseYellow, tulip, alstroemeria);


    }
}
