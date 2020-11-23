package by.jonline.algorithmization.decomposition;

/*Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел: (HOK(A,B) = A * B / HOД(A, B))*/

public class FirstTask {
    public static void main(String[] args) {

        int A = 42;
        int B = 96;

        System.out.println(nod(A, B));
        System.out.println(nok(A, B));
    }

    public static int nod(int A, int B){
        int nodA = 0;
        int resNod = 0;
        int del = 1;
        while (del <= A){
            nodA = A % del == 0 ? del : nodA;
            resNod = B % nodA == 0 ? nodA: resNod;
            del++;
        }
        return resNod;
    }

    public static int nok(int A, int B){
        int multi = 1;
        int resNok = 0;
        int C = A > B ? A : B;
        int D = A < B ? A : B;
        while (multi <= C){
            if ((C * multi) % D == 0){
                resNok = C * multi;
                break;
            }
            multi++;
        }
        return resNok;
    }
}
