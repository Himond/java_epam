package by.jonline.algorithmization.decomposition;

/*Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.*/

public class SeventeenthTask {
    public static void main(String[] args) {

        int num = 125;

        System.out.println(countLoop(num));

    }

    public static int countLoop(int num){

        int zero = num;
        int count = 0;
        int[] arr;

        while (zero != 0){
            arr = getArrOfNumbers(zero);
            zero -= sumNums(arr);
            count++;
        }

        return count;
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

    public static int sumNums(int[] arr){

        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

}


