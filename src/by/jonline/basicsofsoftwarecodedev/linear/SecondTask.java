package by.jonline.basicsofsoftwarecodedev.linear;
/* Вычислить значение выражения по формуле (все переменные принимают действительные значения):
(𝑏 + √𝑏^2 + 4*𝑎*𝑐) / 2*𝑎 − 𝑎^3*𝑐 + 𝑏^−2
*/
public class SecondTask {
    public static void main(String[] args) {
        func(1, 1, 1);
    }

    public static void func(int a, int b, int c){
        if (a != 0 && b != 0) {
            System.out.println((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c))/ (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
        }else if (a == 0) {
            System.out.println("division by zero");
        }else {
            System.out.println("Infinitely large number");
        }

    }
}
