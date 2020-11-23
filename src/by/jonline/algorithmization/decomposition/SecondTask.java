package by.jonline.algorithmization.decomposition;

/*Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел. */

public class SecondTask {
    public static void main(String[] args) {

        int A = 122;
        int B = 36;
        int C = 8;
        int D = 24;

        System.out.println(nod(A, B, C, D));
    }

    public static int nod(int A, int B, int C, int D){
        int nodA = 0;
        int resNod = 0;
        int del = 1;
        while (del <= A){
            nodA = A % del == 0 ? del : nodA;
            resNod = B % nodA == 0 && C % nodA == 0 && D % nodA == 0 ? nodA: resNod;
            del++;
        }
        return resNod;
    }
}
