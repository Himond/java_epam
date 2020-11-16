package by.jonline.algorithmization.multdimarrays;

import java.util.Arrays;
import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] multArr = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};

        for (int[] elem : replacingColumns(multArr, n, m)) {
            System.out.println(Arrays.toString(elem));
        }
    }

    public static int[][] replacingColumns(int[][] arr, int n, int m){
        for (int i = 0; i < arr.length; i++) {
            int repl = arr[i][m];
            arr[i][m] = arr[i][n];
            arr[i][n] = repl;
        }
        return arr;
    }



}
