package by.jonline.algorithmization.sorting;
/*Сортировка обменами. Дана последовательность чисел
a1 <= a2 <= ... <= an.Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
ai и ai+1. Если ai > ai+1, то делается перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/
import java.util.Arrays;

public class FourthTask {
    public static void main(String[] args) {
        int[] arr = {-6, 5, 0, 0, -8, 7, 22, 8, 34, 6, 8, 13, -43, 76, 34};
        System.out.println(Arrays.toString(exchangesSort(arr)));
    }
    public static int[] exchangesSort(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] < arr[j + 1]){
                    int num = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = num;
                    count++;
                }
            }
        }
        System.out.println(count);
        return arr;
    }
}
