package by.jonline.algorithmization.decomposition;

/*Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.*/

public class FifteenthTask {
    public static void main(String[] args) {
        SequenceNum seq = new SequenceNum(2);
        seq.getSequenceNums();

    }
}

class SequenceNum{

    private final int n_digit;
    private final int left;
    private final int right;
    private final int TEN = 10;

    public SequenceNum(int n) throws ArithmeticException{
        if(n <= 0){
            throw new ArithmeticException("Введите число больше 0");
        }
        n_digit = n;
        left = (int)Math.pow(TEN, n - 1);
        right = (int)Math.pow(TEN, n);
    }

    public void getSequenceNums(){
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

    private int[] getArrOfNumbers(int N){
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

    private boolean checkSequenceNums(int[] arr){
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

