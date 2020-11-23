package by.jonline.progwithclass.aggregationandcompositionеtasktwo;

/*Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.*/

public class Engine {

    private final String TYPE_FUEL;
    private final int POWER;
    private final int CYLINDERS;
    private final int FUEL_CONSUMPTION; //Fuel consumption l / 100 km


    public Engine(String type_fuel, int power, int cylinders, int fuel_consumption) {
        this.TYPE_FUEL = type_fuel;
        this.POWER = power;
        this.CYLINDERS = cylinders;
        FUEL_CONSUMPTION = fuel_consumption;
    }

    public String getTYPE_FUEL() {
        return TYPE_FUEL;
    }

    public int getPOWER() {
        return POWER;
    }

    public int getCYLINDERS() {
        return CYLINDERS;
    }

    public int getFUEL_CONSUMPTION() {
        return FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "TYPE_FUEL='" + TYPE_FUEL + '\'' +
                ", POWER=" + POWER +
                ", CYLINDERS=" + CYLINDERS +
                ", FUEL_CONSUMPTION=" + FUEL_CONSUMPTION +
                '}';
    }
}
