package algorithmization;

import java.util.Arrays;

public class OneDimensionalArraysEighthTask {
    public static void main(String[] args) {
        int[] arr = {-2, 3, 5, -2, 4, 6, 8, -2, 4, 0, -2};
        System.out.println(Arrays.toString(minArr(arr)));
    }
    public static int[] minArr(int[] arr){
        int count = 0;
        int countArr = 0;
        int min =arr[0];

        for(int i = 1; i < arr.length; i++){
            min = arr[i] < min ? arr[i] : min;
        }

        for (int elem: arr) {
            count += elem == min ? 1 : 0;
        }
        int[] newArr = new int[arr.length - count];
        for (int i : arr) {
            if (i != min) {
                newArr[countArr] = i;
                countArr += 1;
            }
        }
        return newArr;
    }


}
