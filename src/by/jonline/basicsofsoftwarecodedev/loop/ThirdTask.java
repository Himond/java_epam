package by.jonline.basicsofsoftwarecodedev.loop;

/*Функция по нахожднию суммы квадратов первых ста чисел*/

public class ThirdTask {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sumNumber(n));
    }

    public static int sumNumber(int num){
        int sum = 0;
        for(int i = 0; i <= num; i++){
            sum += i * i;
        }
        return sum;
    }
}
