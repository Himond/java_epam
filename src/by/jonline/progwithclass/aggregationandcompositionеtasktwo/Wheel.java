package by.jonline.progwithclass.aggregationandcompositionеtasktwo;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

import java.util.Objects;

public class Wheel {

    private String manufacturer;
    private int width;
    private int diameter;
    private int max_distance;

    public Wheel(String manufacturer, int width, int diameter, int max_distance) {
        this.manufacturer = manufacturer;
        this.width = width;
        this.diameter = diameter;
        this.max_distance = max_distance;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getWidth() {
        return width;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getMax_distance() {
        return max_distance;
    }

    public void reduceMax_distance(int wear){
        this.max_distance -= wear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return width == wheel.width && diameter == wheel.diameter && max_distance == wheel.max_distance && Objects.equals(manufacturer, wheel.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, width, diameter, max_distance);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "manufacturer='" + manufacturer + '\'' +
                ", width=" + width +
                ", diameter=" + diameter +
                ", max_distance=" + max_distance +
                '}';
    }
}
