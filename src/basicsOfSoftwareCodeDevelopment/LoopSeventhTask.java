package basicsOfSoftwareCodeDevelopment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class LoopSeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        dividers(m, n);
    }

    public static void dividers(int m, int n){
        for(int i = m; i <= n; i ++){
            System.out.print(i + ": ");
            TreeSet<Integer> set = new TreeSet<>();
            for(int j = 2; j <= Math.floor(Math.sqrt(i)); j++){
                if(i % j == 0){
                    set.add(j);
                    int del = i / j;
                    if (del != j){
                        set.add(del);
                    }
                }
            }
            System.out.println(set);
        }
    }
}
