package by.jonline.basicsofoop.taskfive.vara.bean;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы и упаковка.*/

import java.util.Objects;

public class Packaging {

    private String color;
    private String material;
    private int price;

    public Packaging() {
    }

    public Packaging(String color, String material, int price) {
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
        Packaging packaging = (Packaging) o;
        return price == packaging.price && Objects.equals(color, packaging.color) && Objects.equals(material, packaging.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, material, price);
    }

    @Override
    public String toString() {
        return "Packaging{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
