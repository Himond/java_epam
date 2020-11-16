package by.jonline.stringsandbasics.stringasobject;
/* Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
*/
import java.util.Scanner;

public class EighthTask {
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
