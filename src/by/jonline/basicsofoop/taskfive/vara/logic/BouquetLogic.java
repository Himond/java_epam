package by.jonline.basicsofoop.taskfive.vara.logic;

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

public class BouquetLogic {

    public Bouquet createBouquet(Packaging packaging, Flower ... flowers){
        Bouquet newBouquet = new Bouquet();
        newBouquet.setPackaging(packaging);
        for (Flower flower: flowers){
            newBouquet.addFlower(flower);
        }
        return newBouquet;
    }

    public void addFlowers(Bouquet bouquet, Flower... flowers){
        for (Flower flower: flowers){
            bouquet.addFlower(flower);
        }
    }

    public int getTotalPrice(Bouquet bouquet){
        int totalPrice = bouquet.getPackaging().getPrice();
        for (Flower flower: bouquet.getFlowers()){
            totalPrice += flower.getPrice();
        }
        return totalPrice;
    }


}
