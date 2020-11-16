package by.jonline.algorithmization.multdimarrays;
/* Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class FirstTask {
    public static void main(String[] args) {
        int [][] multArr = {{10, 5, 3, 14, 15}, {5, 4, 3, 2, 1}, {6, 4, 3, 2, 1}, {17, 4, 2, 5, 10}};
        printArr(multArr);
    }
    public static void printArr(int[][] arr){
        int len = arr[0].length;
        for (int j = 0; j < len; j++) {
            if(j % 2 != 0) {
                for (int[] ints : arr) {
                    if (arr[0][j] > arr[arr.length - 1][j]) {
                        System.out.println(ints[j]);
                    }
                }
                System.out.println();
            }
        }

    }

}
