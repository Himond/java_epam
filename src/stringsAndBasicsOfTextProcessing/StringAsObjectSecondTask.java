package stringsAndBasicsOfTextProcessing;

public class StringAsObjectSecondTask {
    public static void main(String[] args) {
        String text = "First of all, there are fragments of the original text - words from the author are included here in the archaic language.";
        System.out.println(replaceAB(text));
    }
    public static String replaceAB(String str){
        StringBuilder newStr = new StringBuilder();
        for (char elem: str.toCharArray()){
            newStr.append(elem);
            if(elem == 'a'){
                newStr.append("b");
            }
        }
        return newStr.toString();
    }
}
