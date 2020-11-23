package by.jonline.algorithmization.multdimarray;
/* Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
import java.util.Arrays;

public class FourthTask {
    public static void main(String[] args) {
        int n = 5;
        for (int[] elem: squareMat(n)){
            System.out.println(Arrays.toString(elem));
        }


    }
    public static int[][] squareMat(int n){
        int[][] squarAarr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                squarAarr[i][j] = i % 2 == 0 ? j + 1 : n - j;
            }
        }
        return squarAarr;
    }
}
