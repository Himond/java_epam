package by.jonline.progwithclasses.aggregationandcompositionеtaskfour;

public class AccountIsBlocked extends Exception{
    private long account_number;

    public AccountIsBlocked(String message, long account_number) {
        super(message);
        this.account_number = account_number;
    }

    public long getAccount_number() {
        return account_number;
    }
}
