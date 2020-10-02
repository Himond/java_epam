package basicsOfSoftwareCodeDevelopment;

import java.util.Scanner;

public class LoopFirstTask {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(sumNumber(num));
    }

    public static int sumNumber(int num){
        int sum = 0;
        for(int i = 0; i <= num; sum += i++ );
        return sum;
    }
}
