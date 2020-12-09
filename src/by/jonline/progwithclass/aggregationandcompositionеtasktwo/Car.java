package by.jonline.progwithclass.aggregationandcompositionеtasktwo;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String car_model;
    private List<Wheel> wheels;
    private Engine engine;
    private double tank_volume;
    private double car_mileage;
    private double fuel_quantity;

    {
        this.wheels = new ArrayList<>();
    }

    public Car(){
    }

    public Car(String car_model, Engine engine, double fuel_tank_volume) {
        this.car_model = car_model;
        this.engine = engine;
        this.tank_volume = fuel_tank_volume;
    }

    public String getCar_model() {
        return car_model;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(Wheel wheel) {
        this.wheels.add(wheel);
    }

    public void removeWheels(){
        this.wheels = new ArrayList<>();
    }

    public void removeWheel(Wheel wheel){
        this.wheels.remove(wheel);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getTank_volume() {
        return tank_volume;
    }

    public double getCar_mileage() {
        return car_mileage;
    }

    public void addCar_mileage(double car_mileage) {
        this.car_mileage += car_mileage;
    }

    public double getFuel_quantity() {
        return fuel_quantity;
    }

    public void setFuel_quantity(double fuel_quantity) {
        this.fuel_quantity = fuel_quantity;
    }

    public void removeFuel(double quantity){
        this.fuel_quantity -= quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.tank_volume, tank_volume) == 0 && Double.compare(car.car_mileage, car_mileage) == 0 && Double.compare(car.fuel_quantity, fuel_quantity) == 0 && Objects.equals(car_model, car.car_model) && Objects.equals(wheels, car.wheels) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car_model, wheels, engine, tank_volume, car_mileage, fuel_quantity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "car_model='" + car_model + '\'' +
                ", wheels=" + wheels +
                ", engine=" + engine +
                ", tank_volume=" + tank_volume +
                ", car_mileage=" + car_mileage +
                ", fuel_quantity=" + fuel_quantity +
                '}';
    }
}
