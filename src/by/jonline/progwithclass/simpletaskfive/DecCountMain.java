package by.jonline.progwithclass.simpletaskfive;

/*Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями. Счетчик имеет методы увеличения и
уменьшения состояния, и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.*/

public class DecCountMain {
    public static void main(String[] args){
        DecCounter decCounter1 = new DecCounter();
        DecCounter decCounter2 = new DecCounter(5,2, 10);
        System.out.println(decCounter2.getCount());
        decCounter2.increaseCount();
        System.out.println(decCounter2.getCount());
        decCounter2.increaseCount();
        System.out.println(decCounter2.getCount());
        decCounter2.reduceCount();
        decCounter2.reduceCount();
        decCounter2.reduceCount();
        System.out.println(decCounter2.getCount());
        decCounter2.reduceCount();
        System.out.println(decCounter2.toString());

    }
}
