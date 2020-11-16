package by.jonline.basicsofsoftwarecodedev.loop;
/* Составить программу нахождения произведения квадратов первых двухсот чисел.*/
import java.math.BigDecimal;
public class FourthTask {
    public static void main(String[] args) {
        int n = 200;
        System.out.println(multiplyNumber(n));
    }

    /*Функция по нахождению произведения квадратов чисел*/
    public static BigDecimal multiplyNumber(int num){
        BigDecimal prod = new BigDecimal(1);
        for (int i = 1; i <= num; i++){
            prod = prod.multiply(BigDecimal.valueOf(i * i));
        };
        return prod;
    }
}
