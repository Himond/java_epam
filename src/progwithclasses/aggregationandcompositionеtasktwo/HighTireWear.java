package progwithclasses.aggregationandcompositionеtasktwo;

public class HighTireWear extends Exception{
    private int tire_number;

    public HighTireWear(String message, int tire_number) {
        super(message);
        this.tire_number = tire_number;
    }

    public int getTire_number() {
        return tire_number;
    }
}
