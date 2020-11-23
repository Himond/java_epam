package by.jonline.algorithmization.decomposition;
/*Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.*/

public class SixthTask {

    public static void main(String[] args) {
        int A = 5;
        int B = 25;
        int C = 125;
        coprimeNumbers(A, B, C);
    }

    public static void coprimeNumbers(int A, int B, int C){
        int nodA = 0;
        int resNod = 0;
        int del = 1;
        while (del <= A){
            nodA = A % del == 0 ? del : nodA;
            resNod = B % nodA == 0 && C % nodA == 0? nodA: resNod;
            del++;
        }
        if(resNod == 1){
            System.out.println("Числа являются взаимно простыми");
        }else {
            System.out.println("Числа НЕ являются взаимно простыми");
        }
    }

}
