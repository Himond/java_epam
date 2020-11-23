package by.jonline.algorithmization.decomposition;

/*Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
являются цифры числа N.*/

import java.util.Arrays;

public class TenthTask {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrNum(12345678)));
    }

    public static int[] arrNum(int N){
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
