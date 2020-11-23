package by.jonline.basicsofsoftwarecodedev.loop;

/* Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа.
*/

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Введите число: ");

        while (true){
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
                break;
            }else {
                System.out.println("Ввод не верный: " + scanner.next());
            }
            System.out.print("Введите число: ");
        }
        System.out.println(sumNumber(num));
    }

    public static int sumNumber(int num){
        int sum = 0;
        if (num <= 0){
            System.out.println("Введено неверное число");
            return -1;
        }
        for(int i = 0; i <= num; i++ ){
            sum += i;
        }
        return sum;
    }
}
