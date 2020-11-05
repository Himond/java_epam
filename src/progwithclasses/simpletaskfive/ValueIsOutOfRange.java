package progwithclasses.simpletaskfive;

public class ValueIsOutOfRange extends Exception {
    private int count;

    public ValueIsOutOfRange(String message, int count) {
        super(message);
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
