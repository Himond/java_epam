package by.jonline.basicsofsoftwarecodedev.linear;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
𝑠𝑖𝑛(𝑥) + 𝑐𝑜𝑠(𝑦) / 𝑐𝑜𝑠(𝑥) − 𝑠𝑖𝑛(𝑦) ∗ 𝑡𝑔(𝑥*y)*/

public class ThirdTask {
    public static void main(String[] args) {
        System.out.println(fun(-5,4));
    }

    public static double fun(double x, double y){
        return (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }

}
