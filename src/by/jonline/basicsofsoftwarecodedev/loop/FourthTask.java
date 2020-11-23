package by.jonline.basicsofsoftwarecodedev.loop;

/* Составить программу нахождения произведения квадратов первых двухсот чисел.*/

public class FourthTask {
    public static void main(String[] args) {
        int n = 200;
        System.out.println(multiplyNumber(n));
    }

    /*Функция по нахождению произведения квадратов чисел*/
    public static long multiplyNumber(int num){
        long result = 1;
        long prod;
        for (int i = 1; i <= num; i++){
            prod = result * (long) Math.pow(i, 2);
            if(prod > 0) {
                result = prod;
            }else {
                System.out.println("Достигнут лемит значений long на итерации: " + i);
                break;
            }
        }
        return result;
    }
}
