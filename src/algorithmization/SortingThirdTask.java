package algorithmization;

import java.util.Arrays;

public class SortingThirdTask {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 3, 4, 5, 6};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        for (int i = 0,  k = arr.length - 1; i < k; i++, k--) {
            int num = arr[i];
            arr[i] = arr[k];
            arr[k] = num;
        }
        System.out.println(Arrays.toString(arr));
        }
}
