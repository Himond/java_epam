package by.jonline.basicsofoop.taskfive.varb.bean;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой подарок). Составляющими
 целого подарка являются сладости и упаковка.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Gift {

    private Package aPackage;
    private List<Sweet> sweets;

    {
        this.sweets = new ArrayList<>();
    }

    public Gift() {
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public List<Sweet> getSweets() {
        return sweets;
    }

    public void addSweets(Sweet sweet) {
        this.sweets.add(sweet);
    }

    public void removeSweets(Sweet sweet) {
        this.sweets.remove(sweet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gift gift = (Gift) o;
        return Objects.equals(aPackage, gift.aPackage) && Objects.equals(sweets, gift.sweets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aPackage, sweets);
    }

    @Override
    public String toString() {
        return "Gift{" +
                "aPackage=" + aPackage +
                ", sweets=" + sweets +
                '}';
    }
}
