package by.jonline.algorithmization.decomposition;

/*Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.*/

import java.util.Arrays;

public class FourteentTask {
    public static void main(String[] args) {
        int left = 1;
        int right = 16000;

        getArmNums(left, right);

    }

    public static void getArmNums(int left, int right){
        int[] arr;
        StringBuilder s = new StringBuilder();
        for (int i = left; i <= right; i++) {
            arr = getArr(i);
            if (checkArmNums(arr, i)){
                s.append(i).append(" ");
            }
        }
        if(s.length() == 0){
            System.out.println("В диапазоне от " + left + " до " + right + ": нет чисел Армстронга" );
        }else {
            System.out.println("Числа Армстронга в диапазоне от " + left + " до " + right + ": " + s);
        }

    }

    //метод проверяет является ли число - числом Армстронга
    public static boolean checkArmNums(int[] arr, int num){
        int sum = 0;
        for (int j : arr) {
            sum += Math.pow(j, arr.length);
        }
        return sum == num;
    }

    //метод разбивает число на массив
    public static int[] getArr(int N){

        int del = 1;
        int lenArr = 0;
        int num = 0;

        do {
            lenArr += 1;
            del *= 10;
        } while (N / del != 0);
        int[] arr = new int[lenArr];
        for (int i = 0; i < arr.length; i++) {
            del /= 10;
            arr[i] = N / del - num;
            num = N / del * 10;
        }
        return arr;
    }
}