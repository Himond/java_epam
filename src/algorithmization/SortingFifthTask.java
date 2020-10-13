package algorithmization;

import java.util.Arrays;

public class SortingFifthTask {
    public static void main(String[] args) {
        int[] arr = {-6, 5, 0, 0, -8, 7, 22, 8, 34, 6, 8, 13, -43, 76, 34};
        for (int i = 0; i < arr.length - 1; i++) {
            int key = arr[i + 1];
            int indKey = binSearch(arr, key, i + 1);
            if(indKey <= i){
                int j = i + 1;
                while (j > indKey){
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[indKey] = key;}
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int binSearch(int[] arr, int key, int len){
        int left = -1;
        int right = len;
        while (left < right - 1){
            int mid = (left + right)/2;
            if(arr[mid] < key){
                left = mid;
            }else {
                right = mid;
            }
        }
        return right;
    }

}

