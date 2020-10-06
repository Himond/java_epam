package algorithmization;


public class OneDimensionalArraysNinthTask {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 0, 2, 2, -3, -3, 4, 5};
        System.out.println(arrayNums(arr));
    }
    public static int arrayNums(int[] arr){
        int maxCount = 0;
        int lenArr = 0;
        int[] countArr = new int[arr.length];
        for(int i  = 0; i < arr.length; i++){
            int count = 0;
            for (int k : arr) {
                count += arr[i] == k ? 1 : 0;
            }
            countArr[i] = count;
            if(maxCount < count){
                maxCount = count;
            }
        }

        for (int j : countArr) {
            if (j == maxCount) {
                lenArr += 1;
            }
        }

        int[] newArr = new int[lenArr];
        int num = 0;
        for(int i = 0; i < arr.length; i++){
            if(countArr[i] == maxCount){
                newArr[num] = arr[i];
                num += 1;
            }
        }

        int min = newArr[0];
        for (int elem : newArr) {
            if(elem < min){
                min = elem;
            }
        }

        return min;
    }

}
