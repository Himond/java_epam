package by.jonline.algorithmization.decomposition;

/*Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
*/

public class SixteentTask {
    public static void main(String[] args) {

        int left;
        int right;
        int n = 3;
        final int TEN = 10;

        left = (int)Math.pow(TEN, n - 1);
        right = (int)Math.pow(TEN, n);

        System.out.println(getSumOddNums(left, right));
        System.out.println(getTotalEvenNums(left, right));

    }

    public static int getSumOddNums(int left, int right){
        int sum = 0;
        int[] arr;
        for (int i = left; i < right; i++) {
            arr = getArrOfNumbers(i);
            if (checkOddNums(arr)){
                sum += i;
            }
        }
        return sum;
    }

    public static int[] getArrOfNumbers(int N){
        int del = 1;
        int lenArr = 0;
        int num = 0;
        do {
            lenArr += 1;
            del *= 10;
        } while (N / del != 0);
        int[] arr = new int[lenArr];
        for (int i = 0; i < arr.length; i++) {
            del /= 10;
            arr[i] = N / del - num;
            num = N / del * 10;
        }
        return arr;
    }

    public static boolean checkOddNums(int[] arr){
        boolean check = true;
        for (int j : arr) {
            if (j % 2 == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static int getTotalEvenNums(int left, int right){
        int total = 0;
        int sum = getSumOddNums(left, right);
        int[] arr = getArrOfNumbers(sum);
        for (int j : arr) {
            if (j % 2 == 0) {
                total += 1;
            }
        }
        return total;
    }

}
