package by.jonline.progwithclasses.aggregationandcompositionеtaskfour;

public class InsufficientFunds extends Exception{
    private double available_balance;

    public InsufficientFunds(String message, double available_balance) {
        super(message);
        this.available_balance = available_balance;
    }

    public double getAccount_number() {
        return available_balance;
    }
}
