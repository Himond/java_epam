package algorithmization;

import java.util.Arrays;

public class DecompositionThirteenthTask {
    public static void main(String[] args) {
        try {
            TwinNumbers twin = new TwinNumbers(25);
            twin.getTwinNum();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}

class TwinNumbers {

    private final int left;
    private final int right;
    private int[] twinNum;

    public TwinNumbers(int n) throws ArithmeticException{
        if(n < 2){
            throw new ArithmeticException("Введите число >= 2");
        }
        left = n;
        right = 2 * n;
    }

    public void getTwinNum(){
        StringBuilder s = new StringBuilder();
        int count = 0;
        do{
            int[] twinNum = nextTwinNum(count);
            if(left <= twinNum[0] && twinNum[0] <= right && left <= twinNum[1] && twinNum[1] <= right){
                s.append(Arrays.toString(twinNum)).append(" ");
            }
            count++;
        } while (right > twinNum[1]);
        if(s.length() == 0){
            System.out.println("В диапазоне от " + left + " до " + right + ": нет простых чисел 'близнецов'!!" );
        }else {
            System.out.println("Простые числа 'близнецы' в диапазоне от " + left + " до " + right + ": " + s);
        }
    }

    private int[] nextTwinNum(int count){
        if (count == 0){
            twinNum = new int[]{3, 5};
        }else {
            twinNum = new int[]{6 * count - 1, 6 * count + 1};
        }
        return twinNum;
    }

    }

