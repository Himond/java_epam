package by.jonline.basicsofsoftwarecodedev.loop;

/*Даны два числа. Определить цифры, входящие в запись как первого так и второго числа*/

import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {

        int m = inputNum();
        int n = inputNum();

        boolean flag1;
        boolean flag2;

        for(int i = 0; i <= 9; i++){
            flag1 = identical(i, m);
            flag2 = identical(i, n);
            if (flag1 && flag2){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean identical(int i, int num){

        String n = Integer.toString(Math.abs(num));

        for (char x: n.toCharArray()){
            if(Integer.parseInt(String.valueOf(x)) == i){
                return true;
            }
        }
        return false;
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
