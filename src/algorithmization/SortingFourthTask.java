package algorithmization;

import java.util.Arrays;

public class SortingFourthTask {
    public static void main(String[] args) {
        int[] arr = {-5, -4, -3, 0, 1, 2, 4, 6, 7};
        System.out.println(Arrays.toString(exchangesSort(arr)));
    }
    public static int[] exchangesSort(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] < arr[j + 1]){
                    int num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                    count++;
                }
            }
        }
        System.out.println(count);
        return arr;
    }
}
