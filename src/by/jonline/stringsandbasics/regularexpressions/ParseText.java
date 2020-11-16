package by.jonline.stringsandbasics.regularexpressions;

/*Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
алфавиту.*/

import java.util.Arrays;

class ParseText{

    private final String str;

    public ParseText(String text){
        str = text;
    }

    /*Отсортировать абзацы по количеству предложений*/
    public String sortingParagraphs(){
        String[] arrPar = splitParag(str);
        for (int i = 0; i < arrPar.length - 1;) {
            if(splitSens(arrPar[i]).length > splitSens(arrPar[i + 1]).length){
                String val = arrPar[i];
                arrPar[i] = arrPar[i + 1];
                arrPar[i + 1] = val;
                if(i != 0){
                    i--;
                }
            }
            else {
                i++;
            }
        }
        return String.join("\n", arrPar);
    }

    /*Отсортировать слова по длинне в каждом предложении*/
    public String sortingWordsByLength(){
        String[] arrPar = splitParag(str);
        for (int i = 0; i < arrPar.length; i++) {
            String[] arrSens = splitSens(arrPar[i]);
            for (int j = 0; j < arrSens.length; j++) {
                String[] arrWords = splitWords(arrSens[j]);
                for (int k = 0; k < arrWords.length - 1;) {
                    if(arrWords[k].length() > arrWords[k + 1].length()){
                        String word = arrWords[k];
                        arrWords[k] = arrWords[k + 1];
                        arrWords[k + 1] = word;
                        if(k != 0){
                            k--;
                        }
                    }
                    else {
                        k++;
                    }
                }
                arrSens[j] = String.join(" ", arrWords) + ".";
            }
            arrPar[i] = String.join(" ", arrSens);
        }
        return String.join("\n", arrPar);
    }

    /*Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства - по алфавиту*/
    public String sortByCharacter(char ch){
        String[] arrPar = splitParag(str.toLowerCase());
        for (int i = 0; i < arrPar.length; i++) {
            String[] arrSens = splitSens(arrPar[i]);
            for (int j = 0; j < arrSens.length; j++) {
                String[] arrLexems = splitWords(arrSens[j]);
                Arrays.sort(arrLexems);
                for (int k = 0; k < arrLexems.length - 1;) {
                    if(countCharInWord(arrLexems[k], ch) < countCharInWord(arrLexems[k + 1], ch)){
                        String word = arrLexems[k];
                        arrLexems[k] = arrLexems[k + 1];
                        arrLexems[k + 1] = word;
                        if(k != 0){
                            k--;
                        }
                    } else {
                        k++;
                    }
                }
                arrSens[j] = String.join(" ", arrLexems) + ".";
            }
            arrPar[i] = String.join(" ", arrSens);
        }
        return String.join("\n", arrPar);
    }

    @Override
    public String toString() {
        return str;
    }

    private String[] splitParag(String par){
        return par.split("\n");
    }

    private String[] splitSens(String sens){
        return sens.split("\\. |\\.");
    }

    private String[] splitWords(String sens){
        return sens.split("\\s+|, \\s*");
    }

    private int countCharInWord(String word, char ch){
        int count = 0;
        for (char elem: word.toCharArray()) {
            count += elem == ch ? 1 : 0;
        }
        return count;
    }

}