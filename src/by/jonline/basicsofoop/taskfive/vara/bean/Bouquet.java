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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bouquet {

    private String name;
    private List<Flower> flowers;
    private Packaging packaging;

    {
        flowers = new ArrayList<>();
        packaging = null;
    }

    public Bouquet() {
    }

    public Bouquet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return Objects.equals(name, bouquet.name) && Objects.equals(flowers, bouquet.flowers) && Objects.equals(packaging, bouquet.packaging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flowers, packaging);
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "name='" + name + '\'' +
                ", flowers=" + flowers +
                ", packaging=" + packaging +
                '}';
    }
}
