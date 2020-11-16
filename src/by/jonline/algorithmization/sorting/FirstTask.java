package by.jonline.algorithmization.sorting;
/*Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.*/
import java.util.Arrays;

public class FirstTask {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(sumArr(arr1, arr2, k)));
    }
    public static int[] sumArr(int[] arr1, int[] arr2, int k){
        int count = 0;
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArr.length;) {
            newArr[i] = arr1[count];
            count++;
            i++;
            if (i == k + 1) {
                for (int value : arr2) {
                    newArr[i] = value;
                    i++;
                }
            }
        }
        return newArr;
    }

}
