package by.jonline.algorithmization.multdimarray;

/*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/

import java.util.Arrays;

public class TwelfthTask {
    public static void main(String[] args) {
        int[][] arr = {{5, 4, 2, -5, 7, 8}, {9, 8, 7, 6, 5, -4, 3, 2, 1 ,-100}, {8, 3, 7, -8}};
        sortArr(arr);
    }

    public static void sortArr(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = arr[i].length - 1; k > j; k--) {
                    if (arr[i][k - 1] > arr[i][k]) {
                        int elem = arr[i][k - 1];
                        arr[i][k - 1] = arr[i][k];
                        arr[i][k] = elem;
                    }
                }
            }
        }

        for (int[] newArr : arr) {
            System.out.println(Arrays.toString(newArr));
        }

    }
}
