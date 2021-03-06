package by.jonline.algorithmization.multdimarray;
/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.*/
import java.util.Arrays;

public class ThirteenthTask {
    public static void main(String[] args) {
        int[][] arr = {{18, 17, 16, 15, 14, 13}, {12, 11, 10, 9, 8, 7}, {6, 5, 4, 3, 2, 1}};
        sortArr(arr);
    }

    public static void sortArr(int [][] arr) {
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
