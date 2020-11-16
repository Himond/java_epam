package by.jonline.basicsofsoftwarecodedev.linear;

public class ThirdTask {
    public static void main(String[] args) {
        System.out.println(fun(-5,4));
    }

    public static double fun(double x, double y){
        return (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }

}
