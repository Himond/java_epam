package by.jonline.algorithmization.decomposition;

import java.util.Arrays;

public class TwelfthTask {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrKN(1258, 501)));
    }
    public static int[] arrKN(int K, int N){
        int len = K % N == 0 ? K / N : K / N + 1;
        int[] arr = new int[len];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((sum + N) <= K){
                arr[i] = N;
                sum += N;
            }else {
                arr[i] = K - sum;
            }
        }
        return arr;
    }
}
