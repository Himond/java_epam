package by.jonline.progwithclass.aggregationandcompositionеtasktwo;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

import java.util.Objects;

public class Engine {

    private int power;
    private int fuel_consuption;

    public Engine( int power, int fuel_consumption) {
        this.power = power;
        this.fuel_consuption = fuel_consumption;
    }

    public int getPOWER() {
        return power;
    }

    public int getFuel_consuption() {
        return fuel_consuption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return power == engine.power && fuel_consuption == engine.fuel_consuption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, fuel_consuption);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "POWER=" + power +
                ", FUEL_CONSUMPTION=" + fuel_consuption +
                '}';
    }
}
