package by.jonline.algorithmization.sorting;

/*Сортировка вставками. Дана последовательность чисел
a1, a2, ... , an. Требуется переставить числа в порядке возрастания. Делается это следующим образом. Пусть
a1, a2, ..., ai - упорядоченная последовательность, т. е. a1 <= a2 <=...<= an. Берется следующее число ai+1
и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
*/
import java.util.Arrays;

public class FifthTask {
    public static void main(String[] args) {
        int[] arr = {-6, 5, 0, 0, -8, 7, 22, 8, 34, 6, 8, 13, -43, 76, 34};
        for (int i = 0; i < arr.length - 1; i++) {
            int key = arr[i + 1];
            int indKey = binSearch(arr, key, i + 1);
            if(indKey <= i){
                int j = i + 1;
                while (j > indKey){
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[indKey] = key;}
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int binSearch(int[] arr, int key, int len){
        int left = -1;
        int right = len;
        while (left < right - 1){
            int mid = (left + right)/2;
            if(arr[mid] < key){
                left = mid;
            }else {
                right = mid;
            }
        }
        return right;
    }

}

