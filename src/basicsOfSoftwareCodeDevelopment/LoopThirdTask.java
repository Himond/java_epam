package basicsOfSoftwareCodeDevelopment;

/*Функция по нахожднию суммы квадратов первых ста чисел*/
public class LoopThirdTask {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sumNumber(n));
    }

    public static int sumNumber(int num){
        int sum = 0;
        for(int i = 0; i <= num; sum += i * i++);
        return sum;
    }
}
