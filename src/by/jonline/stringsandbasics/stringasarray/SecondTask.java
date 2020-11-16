package by.jonline.stringsandbasics.stringasarray;
/*Замените в строке все вхождения 'word' на 'letter'.
 */
public class SecondTask {
    public static void main(String[] args) {
        String str = "Hello word, new WORD, good word.....word!";
        str = wordToLetter(str);
        System.out.println(str);
    }
    public static String wordToLetter(String str){
        String word = "";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 65 || (str.charAt(i) > 90 && str.charAt(i) <97) || str.charAt(i) > 122){
                newStr += checkWord(word);
                newStr += str.charAt(i);
                word = "";
            }else if(i == str.length() - 1){
                word += str.charAt(i);
                System.out.println(word);
                newStr += checkWord(word);
            }else {
                word += str.charAt(i);
            }
        }
        return newStr;
    }

    public static String checkWord(String word){
        return word.toLowerCase().equals("word") ? "letter" : word;
    }

}


