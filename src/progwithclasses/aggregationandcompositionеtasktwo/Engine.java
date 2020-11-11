package progwithclasses.aggregationandcompositionеtasktwo;

public class Engine {

    private final String TYPE_FUEL;
    private final int POWER;
    private final int CYLINDERS;

    public Engine(String type_fuel, int power, int cylinders) {
        this.TYPE_FUEL = type_fuel;
        this.POWER = power;
        this.CYLINDERS = cylinders;
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

    @Override
    public String toString() {
        return "Engine{" +
                "TYPE_FUEL='" + TYPE_FUEL + '\'' +
                ", POWER=" + POWER +
                ", CYLINDERS=" + CYLINDERS +
                '}';
    }
}
