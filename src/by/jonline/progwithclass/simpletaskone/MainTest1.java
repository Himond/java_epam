package by.jonline.progwithclass.simpletaskone;

public class MainTest1 {
    public static void main(String[] args) {
        Test1<Integer, Double> test1 = new Test1<>();
        System.out.println(test1.toString());
        test1.setY(8.5);
        test1.setX(5);
        test1.sumXY();
        test1.maxValue();
    }
}
