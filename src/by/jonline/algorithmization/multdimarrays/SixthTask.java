package by.jonline.algorithmization.multdimarrays;
/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
import java.util.Arrays;

public class SixthTask {
    public static void main(String[] args) {
        int n = 23;
        for (int[] elem: squareMat(n)){
            System.out.println(Arrays.toString(elem));
        }


    }
    public static int[][] squareMat(int n){
        int[][] squarAarr = new int[n][n];
        int m = 0;
        for (int i = 0; i < n; i++) {
            if(i < Math.ceil(squarAarr.length / 2)){
                for (int j = m; j < squarAarr.length - m; j++) {
                    squarAarr[i][j] = 1;
                }
                m++;
            }else {
                if(n % 2 == 0){
                    m--;
                    for (int j = m; j < squarAarr.length - m; j++) {
                    squarAarr[i][j] = 1;
                    }
                }else{
                    for (int j = m; j < squarAarr.length - m; j++) {
                        squarAarr[i][j] = 1;
                    }
                    m--;
                }
            }
        }
        return squarAarr;
    }
}
