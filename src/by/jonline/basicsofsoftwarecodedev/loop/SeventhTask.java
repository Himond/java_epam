package by.jonline.basicsofsoftwarecodedev.loop;

/*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.*/

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        int m;
        int n;
        m = inputNum();
        n = inputNum();
        dividers(m, n);
    }

    public static void dividers(int m, int n){
        if (n <= m || m < 0){
            System.out.println("Введены неправильные значения диапазона чисел");
        }else {
            for(int i = m; i <= n; i ++){
                System.out.print(i + ": ");
                for(int j = 2; j <= Math.floor(Math.sqrt(i)); j++){
                    if(i % j == 0){
                        System.out.print(j + " ");
                        int del = i / j;
                        if (del != j){
                            System.out.print(del + " ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }

    public static int inputNum(){
        int num;
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (true){
            if(scanner.hasNextInt()){
                num = scanner.nextInt();
                break;
            }
            else {
                System.out.println("Введено неверное значение: " + scanner.next());
            }
            System.out.print("Введите число: ");
        }
        return num;
    }
}
