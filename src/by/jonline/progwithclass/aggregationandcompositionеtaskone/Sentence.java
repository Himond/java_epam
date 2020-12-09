package by.jonline.progwithclass.aggregationandcompositionеtaskone;

/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sentence {

    private List<Word> sentence;

    public Sentence() {
        this.sentence = new ArrayList<>();
    }

    public List<Word> getSentence() {
        return sentence;
    }

    public void setSentence(Word word) {
        this.sentence.add(word);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return Objects.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + getSentence() +
                '}';
    }
}
