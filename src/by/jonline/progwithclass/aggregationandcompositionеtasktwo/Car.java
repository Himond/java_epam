package by.jonline.progwithclass.aggregationandcompositionеtasktwo;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class Car {

    private String car_model;
    private Wheel[] wheels;
    private Engine engine;
    private final double FUEL_TANK_VOLUEM;
    private double fuel_in_the_tank;

    public Car(String car_model, Wheel[] wheels, Engine engine, double fuel_tank_volume) {
        this.car_model = car_model;
        this.wheels = wheels;
        this.engine = engine;
        this.FUEL_TANK_VOLUEM = fuel_tank_volume;
        this.fuel_in_the_tank = fuel_tank_volume;
    }

    public String getCar_model() {
        return car_model;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public double getFuel_in_the_tank() {
        return fuel_in_the_tank;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //the method simulates the movement of a car
    public int run(int distance) {
        for (int i = 0; i < wheels.length; i++){
            if(wheels[i].checkMileage(distance)){
                System.out.println("Замените колесо номер: " + i);
                return i + 1;
            }
        }
        for (int mil = 0; mil <= distance; mil++){
            fuel_in_the_tank = fuel_in_the_tank - 1 / 100.0 * engine.getFUEL_CONSUMPTION();
            for (Wheel wheel : wheels) {
                wheel.tireWear(1);
            }
            if (fuel_in_the_tank <= 0 ){
                System.out.println("Недостаточно топлива в баке");
                return -1;
            }
        }
        return distance;
    }

    //the method simulates filling a car
    public void refuelCar(){
        this.fuel_in_the_tank = FUEL_TANK_VOLUEM;
        System.out.println("Бак заправлен");
    }

    //method simulates wheel replacement
    public void wheelChange(int i){
        int num = i - 1;
        wheels[num] = new Wheel(wheels[num].getManufacturer(), wheels[num].getWidth(), wheels[num].getHeight_to_width_ratio(),
                wheels[num].getTire_design(), wheels[num].getDiameter(), wheels[num].getLoad_index(), wheels[num].getSpeed_index());
        System.out.println("Колесо номер: " + num  + " заменено");
    }

}
