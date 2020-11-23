package by.jonline.algorithmization.multdimarray;
/*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.*/
public class SecondTask {
    public static void main(String[] args) {
        int[][] squareMat = {{10, 2, 3, 4}, {1, 20, 3, 4}, {1, 2, 30, 4}, {1, 2, 3, 40}};
        printDiagElem(squareMat);
    }
    public static void printDiagElem(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i]);
        }

    }
}
