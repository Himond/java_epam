package by.jonline.basicsofsoftwarecodedev.loop;
/*. Вычислить значения функции на отрезке [а,b] c шагом h:*/
public class SecondTask {
    public static void main(String[] args) {
        int a = -5;
        int b = 5;
        int h = 1;
        for (int i = a; i < b; i += h){
            System.out.println(func(i));
        }

    }
    public static int func(int num){
        return num > 2 ? num: (num * (-1));
    }
}
