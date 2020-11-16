package by.jonline.algorithmization.onedimensionalarrays;

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
