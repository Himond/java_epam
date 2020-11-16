package by.jonline.algorithmization.multdimarrays;

public class NinthTask {
    public static void main(String[] args) {
        int [][] multArr = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        sumArr(multArr);
    }

    public static void sumArr(int[][] arr){
        int sumcolumn;
        int maxsum = 0;
        int idmaxsumcolumn = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sumcolumn = 0;
            for (int[] ints : arr) {
                sumcolumn += ints[j];
            }
            System.out.println("Sum of " + j + " column: " + sumcolumn);
            if(maxsum < sumcolumn){
                maxsum = sumcolumn;
                idmaxsumcolumn = j;
            }
        }
        System.out.println("Max amount has " + idmaxsumcolumn + " column: " + maxsum);
    }
}
