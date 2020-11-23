package by.jonline.algorithmization.onedimensionalarray;
/*В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/

public class FirstTask {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num = 3;
        System.out.println(sumArray(arr, num));

    }
    public static int sumArray(int [] arr, int num){
        int sum = 0;
        for (int j : arr) {
            if (j % num == 0) {
                sum += j;
            }
        }
        return sum;
    }
}
