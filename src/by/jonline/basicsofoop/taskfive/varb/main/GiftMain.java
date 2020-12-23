package by.jonline.basicsofoop.taskfive.varb.main;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок). Составляющими
 целого подарка являются сладости и упаковка.*/

import by.jonline.basicsofoop.taskfive.varb.bean.Gift;
import by.jonline.basicsofoop.taskfive.varb.bean.Package;
import by.jonline.basicsofoop.taskfive.varb.bean.Sweet;
import by.jonline.basicsofoop.taskfive.varb.logic.GiftLogic;
import by.jonline.basicsofoop.taskfive.varb.view.GiftView;

public class GiftMain {
    public static void main(String[] args) {
        GiftLogic logic = new GiftLogic();
        GiftView view = new GiftView();

        Package pack = new Package("Red", "carton", 120);
        Sweet candy1 = logic.createSweet("Alenka", "candy", 150);
        Sweet candy2 = logic.createSweet("Alenka", "candy", 150);
        Sweet chocolate = logic.createSweet("Milka", "chocolate", 220);

        Gift gift = logic.createGift(pack, candy1, candy2, chocolate);

        view.printGift("Подарок содержит: ", gift);
        System.out.println("полная стоимость: " + logic.getTotalPrice(gift) + " rub");

    }
}
