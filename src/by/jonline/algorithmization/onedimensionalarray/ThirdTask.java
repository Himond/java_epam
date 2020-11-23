package by.jonline.algorithmization.onedimensionalarray;
/*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
*/
public class ThirdTask {
    public static void main(String[] args) {
        int[] arr = {-2, 4, 3, 0, -3, 45, -2, 0, 6, 7, -3, 4, 0, 0, -10};
        counterArr(arr);
    }

    public static void counterArr(int[] arr){
        int negative = 0;
        int positive = 0;
        int zero = 0;
        for (int j : arr) {
            negative += j < 0 ? 1 : 0;
            positive += j > 0 ? 1 : 0;
            zero += j == 0 ? 1 : 0;
        }
        System.out.println("negative numbers: " + negative + "\n" + "positive numbers: " + positive + "\n" + "zero: " + zero);

    }
}
