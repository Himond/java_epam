package by.jonline.algorithmization.multdimarray;

/* В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.*/

import java.util.Arrays;
import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {

        int n = inputNum();
        int m = inputNum();
        int [][] multArr = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};

        for (int[] elem : replacingColumns(multArr, n, m)) {
            System.out.println(Arrays.toString(elem));
        }
    }

    public static int[][] replacingColumns(int[][] arr, int n, int m){
        if(n > arr.length || m > arr.length || n < 0 || m < 0){
            System.out.println("Введенные данные не корректны");
            return null;
        }else {
            for (int i = 0; i < arr.length; i++) {
                int repl = arr[i][m];
                arr[i][m] = arr[i][n];
                arr[i][n] = repl;
            }
            return arr;
        }
    }

    public static int inputNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (true){
            if(scanner.hasNextInt()){
                return scanner.nextInt();
            }else {
                System.out.println("Введеное значение некоректно: " + scanner.next());
            }
            System.out.print("Введите число: ");
        }
    }


}
