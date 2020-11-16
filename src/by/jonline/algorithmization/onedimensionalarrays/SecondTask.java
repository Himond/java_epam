package by.jonline.algorithmization.onedimensionalarrays;
/*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен*/
import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 7;
        replase(arr, num);
    }
    public static void replase(int[] arr, int Z){
        int repcount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > Z) {
                arr[i] = Z;
                repcount += 1;
            }
        }
        System.out.println("Modified array: " + Arrays.toString(arr) + "\n" +  "Number of replacements: " + repcount);
    }
}
