package progwithclasses.simpletaskfive;

class RangeSetIncorrectly extends Exception{

    private int upper_limit;
    private int lower_limit;

    public RangeSetIncorrectly(String message, int lower_limit, int upper_limit){
        super(message);
        this.upper_limit = upper_limit;
        this.lower_limit = lower_limit;
    }

    public int getUpper_limit() {
        return upper_limit;
    }

    public int getLower_limit() {
        return lower_limit;
    }
}
