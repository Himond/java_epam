package by.jonline.algorithmization.multdimarrays;
/* Найти положительные элементы главной диагонали квадратной матрицы.*/

public class TenthTask {
    public static void main(String[] args) {
        int [][] multArr = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, -4}};
        positiveDiag(multArr);
    }
    public static void positiveDiag(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][i] > 0){
                System.out.println("matrix element with position [" + i  + ", " + i + "]: "  + arr[i][i]);
            }

        }
    }
}
