package by.jonline.progwithclasses.aggregationandcompositionеtasktwo;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class Car {

    private String car_model;
    private Wheel[] wheels;
    private Engine engine;
    private final int FUEL_TANK_VOLUEM;
    private int fuel_in_the_tank;

    public Car(String car_model, Wheel[] wheels, Engine engine, int fuel_tank_volume) {
        if(wheels.length != 4){
            throw new IllegalArgumentException("Wrong number of wheels");
        }
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

    public int getFuel_in_the_tank() {
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
    public void run(int distance) throws NotEnoughFuelIinTheTank, HighTireWear {
        if (fuel_in_the_tank - distance / 100 * engine.getFUEL_CONSUMPTION() <= 0 ){
            throw new NotEnoughFuelIinTheTank("Not enough fuel in the tank to cover the distance", fuel_in_the_tank);
        }
        for (int i = 0; i < wheels.length; i++){
            if(wheels[i].checkMileage(distance)){
                throw new HighTireWear("Tire replacement required", i);
            }
        }
        fuel_in_the_tank = fuel_in_the_tank - distance / 100 * engine.getFUEL_CONSUMPTION();
        for (Wheel wheel : wheels) {
            wheel.tireWear(distance);
        }
        System.out.println("You have arrived at your destination");
    }

    //the method simulates filling a car
    public void refuelCar(int volume){
        System.out.println(fuel_in_the_tank + volume);
        if (fuel_in_the_tank + volume > FUEL_TANK_VOLUEM){
            throw new IllegalArgumentException("Fuel overflow");
        }else {
            fuel_in_the_tank += volume;
            System.out.println("Fuel filled! Total fuel: " + getFuel_in_the_tank());
        }
    }
    //method simulates wheel replacement
    public void wheelChange(int i){
        int num = i - 1;
        if(num < 0 || num > 3){
            throw new IllegalArgumentException("Wheel number is set incorrectly");
        }
        wheels[num] = new Wheel(wheels[num].getManufacturer(), wheels[num].getWidth(), wheels[num].getHeight_to_width_ratio(),
                wheels[num].getTire_design(), wheels[num].getDiameter(), wheels[num].getLoad_index(), wheels[num].getSpeed_index());
        System.out.println("Wheel number: " + i + " replaced");
    }

}
