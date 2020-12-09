package by.jonline.progwithclass.aggregationandcompositionеtaskone;

/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Text {

    private Sentence header;
    private List<Sentence> text;

    {
        text = new ArrayList<>();
    }
    public Text() {
    }

    public Text(Sentence header) {
        this.header = header;
    }

    public Sentence getHeader() {
        return header;
    }

    public void setHeader(Sentence header) {
        this.header = header;
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(Sentence sentence) {
        this.text.add(sentence);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(header, text1.header) && Objects.equals(text, text1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, text);
    }

    @Override
    public String toString() {
        return "Text{" +
                "header=" + header +
                ", text=" + text +
                '}';
    }
}
