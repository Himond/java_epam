package algorithmization;

import java.util.Arrays;

public class MultdimArraysTwelfthTask {
    public static void main(String[] args) {
        int[][] arr = {{5, 4, 2, -5, 7, 8}, {5, 2, 0, 7, -8, 2}, {8, 3, 7, -8}};
        sortArr(arr);
    }

    public static void sortArr(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i].length - (j + 1); k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int elem = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = elem;
                    }
                }
            }
        }

        for (int[] newArr : arr) {
            System.out.println(Arrays.toString(newArr));
        }

    }
}
