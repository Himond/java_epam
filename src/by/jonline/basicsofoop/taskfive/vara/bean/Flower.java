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

public class Flower {

    private String name;
    private String color;
    private int price;

    public Flower() {
    }

    public Flower(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Flower.Builder newBuilder(){
        return new Flower().new Builder();
    }

    public class Builder{

        private Builder() {
        }

        public Flower.Builder setName(String name){
            Flower.this.name = name;
            return this;
        }

        public Flower.Builder setColor(String color){
            Flower.this.color = color;
            return this;
        }

        public Flower.Builder setPrice(int price){
            Flower.this.price = price;
            return this;
        }


        public Flower build(){
            return Flower.this;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return price == flower.price && Objects.equals(name, flower.name) && Objects.equals(color, flower.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, price);
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
