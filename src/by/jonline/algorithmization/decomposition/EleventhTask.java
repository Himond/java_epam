package by.jonline.algorithmization.decomposition;
/*Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class EleventhTask {
    public static void main(String[] args) {
        maxNum(2341, 34344);
    }
    public static void maxNum(int N, int M){
        int lenN = 0, lenM = 0;
        int del = 1;
        do {
            lenN += 1;
            del *= 10;
        }while (N / del != 0);
        del = 1;
        do {
            lenM += 1;
            del *= 10;
        }while (M / del != 0);
        if(lenN > lenM){
            System.out.println("В числе " + N + " больше цифр чем в числе " + M);
        }else if(lenN < lenM){
            System.out.println("В числе " + M + " больше цифр чем в числе " + N);
        }else{
            System.out.println("Равное количество цифр в числах " + N + " " + M);
        }

    }
}
