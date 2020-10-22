package stringsandbasics;

import java.util.Scanner;

public class StringAsObjectEighthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(longestWord(str));
    }
    public static String longestWord(String str){
        String[] wordArr = str.split(" ");
        String longestword = "";
        for (String elem: wordArr) {
            longestword = longestword.length() < elem.length() ? elem : longestword;
        }
        return longestword;
    }

}
