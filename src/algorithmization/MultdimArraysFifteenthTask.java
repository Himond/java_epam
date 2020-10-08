package algorithmization;

import java.util.Arrays;

public class MultdimArraysFifteenthTask {
    public static void main(String[] args) {
        int[][] arr = {{5, 4, 2, -5, 7, 8}, {5, 2, 25, 7, -8, 2}, {8, 3, 7, -8, 5, 2}};

        for (int[] lineArr: newArr(arr)) {
            System.out.println(Arrays.toString(lineArr));
        }
    }
    public static int[][] newArr(int[][] arr) {
        int maxElem = arr[0][0];
        for (int[] ints : arr) {
            for (int elem : ints) {
                maxElem = elem > maxElem ? elem : maxElem;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] % 2 != 0){
                    arr[i][j] = maxElem;
                }
            }
        }
        return arr;
    }
}
