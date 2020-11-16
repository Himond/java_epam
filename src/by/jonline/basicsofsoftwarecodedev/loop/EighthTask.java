package by.jonline.basicsofsoftwarecodedev.loop;

import java.util.HashSet;
import java.util.Scanner;

public class EighthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        identical(m, n);
    }

    public static void identical(int n, int m){
        String num1 = Integer.toString(n);
        String num2 = Integer.toString(m);
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < num1.length(); i++){
            for(int j = 0; j < num2.length(); j++){
                if(num1.charAt(i) == num2.charAt(j)){
                    set.add(num1.charAt(i));
                }
            }
        }
        for(Character elem: set){
            System.out.print(elem + " ");
        }
    }
}
