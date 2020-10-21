package stringsandbasics;

public class StringAsArrayFifthTask {
    public static void main(String[] args) {
        String str = "  Hello  word,     deeeww      fwef       new   WORD,   good  word...word!   A!     ";
        str = spaceDel(str);
        System.out.println(str);
    }
    public static String spaceDel(String str){
        String word = "";
        String newStr = "";
        for (char elem: str.toCharArray()){
            if(elem != ' ' ) {
                word += elem;
            }else {
                if(word.length() != 0 && newStr.length() != 0){
                    newStr += " " +  word ;
                }else {
                    newStr += word;
                }
                word = "";
            }
        }
        return newStr;
    }

}
