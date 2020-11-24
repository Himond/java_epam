package by.jonline.progwithclass.simpletaskfive;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и
уменьшения состояния, и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.*/

public class DecCounter {

    private int count;
    private int lowerLimit;
    private int upperLimit;

    public DecCounter() {
        lowerLimit = 0;
        upperLimit = 10;
    }

    public DecCounter(int count, int lower_limit, int upper_limit)  {
        if (lower_limit >= upper_limit){
            System.out.println("Введено неверное значения диапазона чисел");
        }else if(count > upper_limit || count < lower_limit){
            System.out.println("Указанное значение счетчика выходит за диапазон чисел");
        }else {
            this.count = count;
            this.lowerLimit = lower_limit;
            this.upperLimit = upper_limit;
        }
    }

    public void increaseCount(){
        this.count += this.count < upperLimit ? 1 : 0;
    }

    public void reduceCount(){
        this.count -= this.count > lowerLimit ? 1 : 0;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "DecCounter{" +
                "count=" + count +
                ", LOWER_LIMIT=" + lowerLimit +
                ", UPPER_LIMIT=" + upperLimit +
                '}';
    }
}

