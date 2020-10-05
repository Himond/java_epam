package algorithmization;


import java.util.Arrays;

public class OneDimensionalArraysFourthTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 0};
        System.out.println(Arrays.toString(minMax(arr)));
    }

    public static int[] minMax(int[] arr){
        int minpos = 0;
        int maxpos = 0;
        for(int i = 1; i < arr.length; i++){
           if(arr[minpos] > arr[i]){
               minpos = i;
           }
           if(arr[maxpos] < arr[i]){
               maxpos = i;
           }
        }
        int minNum = arr[minpos];
        int maxNum = arr[maxpos];
        arr[minpos] = maxNum;
        arr[maxpos] = minNum;
        return arr;
    }
}
