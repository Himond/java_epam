package by.jonline.basicsofsoftwarecodedev.branching;

/* Вычислить значение функции:*/

public class FifthTask {
    public static void main(String[] args) {
        System.out.println(func(2));
    }
    public static double func(double x){
        return x <= 3 ? (x * x - 3 * x + 9) : (1 / (x * x * x + 6));
    }
}
