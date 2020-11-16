package by.jonline.basicsofsoftwarecodedev.linear;
/*Найдите значение функции: z = ( (a – 3 ) * b / 2) + c*/
public class FirstTask {
    public static void main(String[] args) {
        double a = 7;
        double b = 5;
        double c = 6;
        System.out.println(function(a, b, c));

    }

    public static double function(double a, double b, double c){
        return ((a - 3) * b / 2) + c;
    }
}
