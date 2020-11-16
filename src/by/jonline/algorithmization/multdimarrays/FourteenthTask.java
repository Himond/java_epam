package by.jonline.algorithmization.multdimarrays;

import java.util.Arrays;

public class FourteenthTask {
    public static void main(String[] args) {
        for(int[] elem: newArr(10, 10)){
            System.out.println(Arrays.toString(elem));
        }
    }
    public static int[][] newArr(int m, int n){
        int[][] arr = new int[m][n];
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length && i <= j; i++) {
                arr[i][j] = 1;
            }
        }
        return arr;


    }
}
