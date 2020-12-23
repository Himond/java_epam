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

import java.util.Objects;

public class Package {

    private String color;
    private String material;
    private int price;

    public Package() {
    }

    public Package(String color, String material, int price) {
        this.color = color;
        this.material = material;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Package packag = (Package) o;
        return price == packag.price && Objects.equals(color, packag.color) && Objects.equals(material, packag.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, material, price);
    }

    @Override
    public String toString() {
        return "Package{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
