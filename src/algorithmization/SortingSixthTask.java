package algorithmization;

import java.util.Arrays;

public class SortingSixthTask {
    public static void main(String[] args) {
        int[] arr = {6, -5, 0, 0, -8, 7, 22, 8, 34, 6, 8, 13, -43, 76, 34};
        sortShell(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortShell(int[] arr){
        int i = 0;
        while (i < arr.length - 1){
            if(arr[i] > arr[i + 1]){
                int key = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = key;
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }
    }
}
