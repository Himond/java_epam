package by.jonline.algorithmization.decomposition;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/

public class FifteenthTask {
    public static void main(String[] args) {
        int n_digit = 2;
        int left;
        int right;
        final int TEN = 10;

        left = (int)Math.pow(TEN, n_digit - 1);
        right = (int)Math.pow(TEN, n_digit);

        getSequenceNums(left, right, n_digit);

    }

    public static void getSequenceNums(int left, int right, int n_digit){
        int[] arr;
        StringBuilder s = new StringBuilder();
        for (int i = left; i < right; i++) {
            arr = getArrOfNumbers(i);
            if (checkSequenceNums(arr)){
                s.append(i).append(" ");
            }
        }
        if(s.length() == 0){
            System.out.println("В " + n_digit+ "-значных числах: нет возрастающих числовых последовательностей" );
        }else {
            System.out.println("В "+ n_digit +"-значных числах возрастающими числовыми последовательнастями являются числа: " + s);
        }
    }

    //метод разбивает число на массив
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

    //метод проверяет представляет ли число возрастающую последовательность
    public static boolean checkSequenceNums(int[] arr){
        boolean check = true;
        if(arr.length == 1){
            check = false;
        }else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] >= arr[i + 1]) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }


}