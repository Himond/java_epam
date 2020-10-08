package algorithmization;

import java.util.Arrays;

public class MultdimArraysThirteenthTask {
    public static void main(String[] args) {
        int[][] arr = {{18, 17, 16, 15, 14, 13}, {12, 11, 10, 9, 8, 7}, {6, 5, 4, 3, 2, 1}};
        sortArr(arr);
    }

    public static void sortArr(int [][] arr) {
        //Отсортировать строки по возростанию
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length - (j + 1); k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int elem = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = elem;
                    }
                }
            }
        }*/

        //Отсортировать столбцы по возростанию
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k < arr.length - (i + 1); k++) {
                    if(arr[k][j] > arr[k + 1][j]){
                        int elem = arr[k][j];
                        arr[k][j] = arr[k + 1][j];
                        arr[k + 1][j] = elem;
                    }
                }
            }
        }

        for (int[] newArr : arr) {
            System.out.println(Arrays.toString(newArr));
        }

    }
}
