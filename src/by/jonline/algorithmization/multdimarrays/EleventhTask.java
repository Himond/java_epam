package by.jonline.algorithmization.multdimarrays;
/*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
*/
import java.util.Arrays;

public class EleventhTask {
    public static void main(String[] args) {
        int [][] arr = new int[10][20];
        randomArr(arr);
    }

    public static void randomArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) Math.round(Math.random() * 15);
            }
            System.out.println(Arrays.toString(arr[i]));
        }

        for (int i = 0; i < arr.length; i++) {
            int numfive = 0;
            for (int elem: arr[i]) {
                numfive += elem == 5 ? 1 : 0;
            }
            if (numfive >= 3){
                System.out.println("In line " + i + " of numbers 5 three or more");
            }

        }

    }
}
