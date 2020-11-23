package by.jonline.algorithmization.onedimensionalarray;

/* Даны действительные числа a1, a2 ... , an Найти
max( a1 + a2n, a2 + a2n−1, ...,  an + an+1)*/

public class SeventhTask {
    public static void main(String[] args) {
        int[] arr = {-1, -5, 0, -4, -5, 10};
        System.out.println(funcMax(arr));

    }
    public static int funcMax(int[] arr){
        int i, j;
        int maxNum = arr[0] + arr[arr.length - 1];
        if (arr.length > 2){
            for (i = 1, j = arr.length - 2; i < j; i++, j--) {
                maxNum = (arr[i] + arr[j]) > maxNum ? (arr[i] + arr[j]) : maxNum;
                }
        }
        return maxNum;
        }

}
