package by.jonline.algorithmization.sorting;
/* Даны две последовательности
a1 <= a2 <= ... <= an и b1<= b2 <= ... <= bm
. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.*/
import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 0, -1, 5};
        int[] arr2 = {-6, 2, 0, -33, 43};
        System.out.println(Arrays.toString(sumArr(arr1, arr2)));
    }

    public static int[] sumArr(int[] arr1, int[] arr2) {
        int[] sumArr = new int[arr1.length + arr2.length];
        int count = 0;
        for (int elem1: arr1) {
            sumArr[count] = elem1;
            count++;
        }
        for(int elem2: arr2){
            sumArr[count] = elem2;
            count++;
        }
        for (int i = 0; i < sumArr.length; i++) {
            for(int j = sumArr.length - 1; j > i; j--){
                if(sumArr[j - 1] > sumArr[j]){
                    int num = sumArr[j];
                    sumArr[j] = sumArr[j - 1];
                    sumArr[j - 1] = num;
                }
            }
        }
        return sumArr;


    }
}
