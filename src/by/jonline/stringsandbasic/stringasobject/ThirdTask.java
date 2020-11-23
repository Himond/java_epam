package by.jonline.stringsandbasic.stringasobject;
/*Проверить, является ли заданное слово палиндромом*/
public class ThirdTask {
    public static void main(String[] args) {
        String word = "deified";
        System.out.println(palindrome(word));
    }
    public static boolean palindrome(String str){
        StringBuilder revstr = new StringBuilder(str);
        revstr.reverse();
        return str.equals(revstr.toString());
    }
}
