package by.jonline.algorithmization.sorting;

import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(sumArr(arr1, arr2, k)));
    }
    public static int[] sumArr(int[] arr1, int[] arr2, int k){
        int count = 0;
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArr.length;) {
            newArr[i] = arr1[count];
            count++;
            i++;
            if (i == k + 1) {
                for (int value : arr2) {
                    newArr[i] = value;
                    i++;
                }
            }
        }
        return newArr;
    }

}
