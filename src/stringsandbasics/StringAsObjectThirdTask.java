package stringsandbasics;

public class StringAsObjectThirdTask {
    public static void main(String[] args) {
        String word = "deified";
        System.out.println(palindrome(word));
    }
    public static boolean palindrome(String str){
        StringBuilder revstr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--){
            revstr.append(str.charAt(i));
        }
        return str.equals(revstr.toString());
    }
}
