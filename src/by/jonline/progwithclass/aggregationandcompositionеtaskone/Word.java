package by.jonline.progwithclass.aggregationandcompositionеtaskone;

/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/


public class Word {

    private String word;

    public Word(String word) {
        for (char ch: word.toCharArray()){
            if((ch > 90  && ch < 97) || ch < 65 || ch > 122){
                throw new IllegalArgumentException("The word is wrong");
            }
        }
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        for (char ch: word.toCharArray()){
            if((ch > 90  && ch < 97) || ch < 65 || ch > 122){
                throw new IllegalArgumentException("The word is wrong");
            }
        }
        this.word = word;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }

}
