package by.jonline.algorithmization.decomposition;

public class SeventhTask {
    public static void main(String[] args) {
        long num = 9;
        long sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i % 2 != 0 ? factor(i) : 0;
        }
        System.out.println(sum);
    }

    public static long factor(long n){
        long mult = 1;
        if(n == 1 || n == 0){
            return 1;
        }else{
            mult *= factor(n - 1) * n;
        }
        return mult;
    }
}
