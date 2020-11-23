package by.jonline.algorithmization.sorting;

/*Сортировка выбором. Дана последовательность чисел
a1 <= a2 <= ... <= an
.Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
*/

import java.util.Arrays;

public class ThirdTask {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 3, 4, 5, 6};
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        for (int i = 0,  k = arr.length - 1; i < k; i++, k--) {
            int num = arr[i];
            arr[i] = arr[k];
            arr[k] = num;
        }
        System.out.println(Arrays.toString(arr));
        }
}
