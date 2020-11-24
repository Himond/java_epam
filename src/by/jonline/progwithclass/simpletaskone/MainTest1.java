package by.jonline.progwithclass.simpletaskone;

/*Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных*/

public class MainTest1 {
    public static void main(String[] args) {
        Test1 test1 = new Test1(8.5, 5);

        System.out.println(test1.toString());
        System.out.println(test1.sumXY());
        System.out.println(test1.maxValue());

        test1.setY(15.2);
        test1.setX(8.1125);

        System.out.println(test1.sumXY());
        System.out.println(test1.maxValue());

    }
}
