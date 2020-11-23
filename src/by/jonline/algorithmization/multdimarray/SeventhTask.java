package by.jonline.algorithmization.multdimarray;

/*Сформировать квадратную матрицу порядка N по правилу: и подсчитать количество положительных элементов в ней */

import java.util.Arrays;

public class SeventhTask {
    public static void main(String[] args) {

        int n = 5;

        for (double[] elem : squareMat(n)) {
            System.out.println(Arrays.toString(elem));
        }
    }

    public static double[][] squareMat(int n){

        double[][] squarAarr = new double[n][n];
        int positiveCount = 0;

        for (int i = 0; i < squarAarr.length; i++){
            for (int j = 0; j < squarAarr.length; j++){
                double elem = Math.sin((i*i - j*j) / (double)n);
                positiveCount += elem > 0 ? 1 : 0;
                squarAarr[i][j] = elem;
            }
        }
        System.out.println("Positive numbers: " + positiveCount);
        return squarAarr;
        }
}
