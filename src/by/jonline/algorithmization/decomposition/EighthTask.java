package by.jonline.algorithmization.decomposition;

/*Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.*/

public class EighthTask {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3 ,4 ,5, 6, 7};
        int k = 1;
        int m = 3;

        System.out.println(sumElem(arr, k, m));

    }

    public static int sumElem(int[] arr, int k, int m){
        int sum = 0;
        if(k >= 0 & m < arr.length ){
            for (int i = k; i <= m; i++) {
                sum += arr[i];
            }
        }else if(k > 0 & arr.length <= m){
            for (int i = k; i < arr.length; i++) {
                sum += arr[i];
            }
        }else if(k < 0 & m < arr.length){
            for (int i = 0; i <= m; i++) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
