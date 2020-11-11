package progwithclasses.aggregationandcompositionеtaskone;

/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

import java.util.ArrayList;
import java.util.Arrays;

public class Text {

    private Sentence header;
    private Sentence[] text;

    public Text(Sentence header, Sentence[] text) {
        this.header = header;
        this.text = text;
    }
    //print the text title
    public String getHeader() {
        return header.getSentence();
    }

    public void setHeader(Sentence header) {
        this.header = header;
    }

    //Output text to the console
    public String getText() {
        StringBuilder newtext = new StringBuilder();
        newtext.append("\t\t").append(header.getSentence()).append("\n");
        for(int i = 0; i < text.length; i++){
            if(i == 0){
                newtext.append("\t").append(text[i].getSentence()).append(" ");
            }else if(i == text.length -1){
                newtext.append(text[i].getSentence());
            }else {
                newtext.append(text[i].getSentence()).append(" ");
            }
        }
        return newtext.toString();
    }

    public void setText(Sentence[] text) {
        this.text = text;
    }

    //Supplement the text
    public void addText(Sentence[] newtext){
        ArrayList<Sentence> list = new ArrayList<>(Arrays.asList(text));
        list.addAll(Arrays.asList(newtext));
        this.text = list.toArray(new Sentence[0]);
    }
}
