package by.jonline.algorithmization.multdimarray;
/* Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.*/
import java.util.Arrays;

public class FourteenthTask {
    public static void main(String[] args) {
        for(int[] elem: newArr(8, 8)){
            System.out.println(Arrays.toString(elem));
        }
    }

    public static int[][] newArr(int m, int n){
        int[][] arr;
        if (m <= 0 || n <= 0){
            arr = new int[0][0];
        }else {
            arr = new int[m][n];
            for (int j = 0; j < arr[0].length; j++) {
                for (int i = 0; i < arr.length && i <= j; i++) {
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
}
