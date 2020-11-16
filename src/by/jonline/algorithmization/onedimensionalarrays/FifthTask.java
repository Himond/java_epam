package by.jonline.algorithmization.onedimensionalarrays;

public class FifthTask {
    public static void main(String[] args) {
        int[] arr = {-1, -2, 35, -4, -5, 8, 43, 23, 0};
        print(arr);
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > i){
                System.out.println(arr[i]);
            }
        }
    }
}
