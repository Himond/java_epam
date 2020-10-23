package stringsandbasics;

public class StringAsObjectEleventhTask {
    public static void main(String[] args) {
        String str = "Unlike the planets of the earth group that have long been known to astronomers, the spectral pattern is a cross-section. Option shakes far Foucault's pendulum. Maternity time, sublimating from the surface of the comet's core, reflects the perihelion.\n" +
                "The full moon, in the first approximation, illustrates the deep sky object. The movement is vitally illustrated by parallax. The solar Eclipse is accidental.\n" +
                "The annual parallax, at first glance, crosses out the asteroid aphelion.";
        ParseText text = new ParseText(str);
        System.out.println(text);
        System.out.println();
        System.out.println(text.sortingParagraphs());
        System.out.println();
        System.out.println(text.sortingWordsByLength());
    }
}

class ParseText{

    private String str;

    public ParseText(String text){
        str = text;
    }

    /*Отсортировать абзацы по количеству предложений*/
    public String sortingParagraphs(){
        String[] arrPar = splitParag(str);
        sortShell(arrPar);
        return String.join("\n", arrPar);
    }

    /*Отсортировать слова по длинне в каждом предложении*/
    public String sortingWordsByLength(){
        String[] arrPar = str.split("\n");
        for (int i = 0; i < arrPar.length; i++) {
            String[] arrSens = arrPar[i].split("\\. |\\.");
            for (int j = 0; j < arrSens.length; j++) {
                String[] arrWords = arrSens[j].split("\\s+|, \\s*");
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

    public String sortByCharacter(char ch){
        return null;
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

    private void sortShell(String[] arr){
        for (int i = 0; i < arr.length - 1;) {
            if(splitSens(arr[i]).length > splitSens(arr[i + 1]).length){
                String word = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = word;
                if(i != 0){
                    i--;
                }
            }
            else {
                i++;
            }
        }
    }




}
