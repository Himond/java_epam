package by.jonline.algorithmization.onedimensionalarray;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.*/

import java.util.Arrays;

public class TenthTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        compress(arr);
    }

    public static void compress(int[] arr){
        int firstElem;
        int secondElem;
        int counter = 1;
        int num = (int) Math.round(arr.length / 2.0);

        for (int i = 1; i <= num; i++) {
            for(int j = counter; j < arr.length - 1; j++) {
                firstElem = arr[j];
                secondElem = arr[j + 1];
                arr[j] = secondElem;
                arr[j + 1] = firstElem;
            }
            counter += 1;
        }

        for (int i = num; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));

    }
}
