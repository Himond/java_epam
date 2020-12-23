package by.jonline.basicsofoop.taskfive.varb.logic;

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

import java.util.regex.Pattern;

public class GiftLogic {

    public Sweet createSweet(String name, String category, int price){
        String pars = "^[a-zA-z]+$";
        Pattern pattern = Pattern.compile(pars);
        Sweet.Builder builder = Sweet.newBuilder();
        if(pattern.matcher(name).find()){
            builder.setName(name);
        }
        if (pattern.matcher(category).find()){
            builder.setCategory(category);
        }
        if(price >= 0){
            builder.setPrice(price);
        }
        return builder.build();
    }

    public Gift createGift(Package pack, Sweet... sweets){
        Gift gift = new Gift();
        gift.setaPackage(pack);
        for (Sweet sweet: sweets){
            gift.addSweets(sweet);
        }
        return gift;
    }

    public int getTotalPrice(Gift gift){
        int totalPrice = gift.getaPackage().getPrice();
        for (Sweet sweet: gift.getSweets()){
            totalPrice += sweet.getPrice();
        }
        return totalPrice;
    }

    public void addSweets(Gift gift, Sweet... sweets){
        for (Sweet sweet: sweets){
            gift.addSweets(sweet);
        }
    }

    public void removeSweets(Gift gift, Sweet... sweets){
        for (Sweet sweet: sweets){
            gift.removeSweets(sweet);
        }
    }

    public void setPackage(Gift gift, Package pack){
        gift.setaPackage(pack);
    }
}
