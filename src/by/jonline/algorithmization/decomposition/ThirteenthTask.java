package by.jonline.algorithmization.decomposition;

/*Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.*/

import java.util.Arrays;

public class ThirteenthTask {
    public static void main(String[] args) {
        int left = 25;
        int right = left * 2;
        getTwinNum(left, right);
    }

    public static void getTwinNum (int left, int right){
        StringBuilder s = new StringBuilder();
        int count = 0;
        int[] twinNum;

        do {
            twinNum = nextTwinNum(count);
            if (left <= twinNum[0] && twinNum[0] <= right && left <= twinNum[1] && twinNum[1] <= right) {
                s.append(Arrays.toString(twinNum)).append(" ");
            }
            count++;
        } while (right > twinNum[1]);
        if (s.length() == 0) {
            System.out.println("В диапазоне от " + left + " до " + right + ": нет простых чисел 'близнецов'!!");
        } else {
            System.out.println("Простые числа 'близнецы' в диапазоне от " + left + " до " + right + ": " + s);
        }
    }

    public static int[] nextTwinNum (int count){
        int[] twinNum;
        if (count == 0) {
            twinNum = new int[]{3, 5};
        } else {
            twinNum = new int[]{6 * count - 1, 6 * count + 1};
        }
        return twinNum;
    }


}



