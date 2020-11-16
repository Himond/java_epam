package by.jonline.progwithclasses.aggregationandcompositionеtaskone;

/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

import java.util.ArrayList;

public class Sentence {

    private Word[] sentence;

    public Sentence(Word[] sentence) {
        sentence[0] = trasformWord(sentence[0]);
        this.sentence = sentence;
    }

    public Sentence(Word sentence) {
        ArrayList<Word> list = new ArrayList<>();
        list.add(trasformWord(sentence));
        this.sentence = list.toArray(new Word[0]);
    }

    //output a text sentence to the console
    public String getSentence() {
        StringBuilder sent = new StringBuilder();
        for(int i = 0; i < sentence.length; i++){
            if(i != sentence.length - 1){
                sent.append(sentence[i].getWord()).append(" ");
            }else {
                sent.append(sentence[i].getWord()).append(".");
            }
        }
        return sent.toString();
    }

    public void setSentence(Word[] sentence) {
        this.sentence = sentence;
    }

    private Word trasformWord(Word word){
        char[] new_word = word.getWord().toCharArray();
        new_word[0] = (char) (new_word[0] - 32);
        return new Word(String.valueOf(new_word));
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence=" + getSentence() +
                '}';
    }
}
