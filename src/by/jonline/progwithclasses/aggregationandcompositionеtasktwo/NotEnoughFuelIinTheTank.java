package by.jonline.progwithclasses.aggregationandcompositionеtasktwo;

public class NotEnoughFuelIinTheTank extends Exception{
    private int fuel_tank_volume;

    public NotEnoughFuelIinTheTank(String message, int fuel_tank_volume) {
        super(message);
        this.fuel_tank_volume = fuel_tank_volume;
    }

    public int getFuel_tank_volume() {
        return fuel_tank_volume;
    }
}
