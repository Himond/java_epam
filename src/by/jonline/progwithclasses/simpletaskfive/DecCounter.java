package by.jonline.progwithclasses.simpletaskfive;
/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и
уменьшения состояния, и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.*/

public class DecCounter {

    private int count;
    public final int LOWER_LIMIT;
    public final int UPPER_LIMIT;

    public DecCounter() {
        UPPER_LIMIT = 10;
        LOWER_LIMIT = 0;
    }

    public DecCounter(int count, int lower_limit, int upper_limit) throws RangeSetIncorrectly, ValueIsOutOfRange {
        if (lower_limit >= upper_limit){
            throw new RangeSetIncorrectly("Incorrect range values are set", lower_limit, upper_limit);
        }else if(count > upper_limit || count < lower_limit){
            throw new ValueIsOutOfRange("The specified value is out of range", count);
        }else {
            this.count = count;
            this.LOWER_LIMIT = lower_limit;
            this.UPPER_LIMIT = upper_limit;
        }
    }

    public void increaseCount(){
        this.count += this.count < UPPER_LIMIT ? 1 : 0;
    }

    public void reduceCount(){
        this.count -= this.count > LOWER_LIMIT ? 1 : 0;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "DecCounter{" +
                "count=" + count +
                ", LOWER_LIMIT=" + LOWER_LIMIT +
                ", UPPER_LIMIT=" + UPPER_LIMIT +
                '}';
    }
}

