package by.jonline.basicsofsoftwarecodedev.loop;
/* Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
*/
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(sumNumber(num));
    }

    public static int sumNumber(int num){
        int sum = 0;
        for(int i = 0; i <= num; sum += i++ );
        return sum;
    }
}
