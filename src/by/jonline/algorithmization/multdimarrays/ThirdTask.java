package by.jonline.algorithmization.multdimarrays;

public class ThirdTask {
    public static void main(String[] args) {
        int [][] multArr = {{10, 5, 3, 14, 15}, {5, 4, 3, 2, 1}, {6, 4, 3, 2, 1}, {17, 4, 2, 5, 10}};
        int k = 3;
        int p = 4;
        printArr(multArr, k, p);
    }
    public static void printArr(int[][] arr, int k, int p){
        System.out.print("row " + k + ": ");
        for (int elem: arr[k]){
            System.out.print(elem + " ");
        }
        System.out.println();
        System.out.print("column " + p + ": ");
        for (int[] ints : arr) {
            System.out.print(ints[p] + " ");
        }
    }
}
