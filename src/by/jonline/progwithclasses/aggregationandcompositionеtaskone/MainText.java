package by.jonline.progwithclasses.aggregationandcompositionеtaskone;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.*/

public class MainText {
    public static void main(String[] args) {
        Word word1 = new Word("giraffes");
        Word word2 = new Word("there");
        Word word3 = new Word("are");
        Word word4 = new Word("different");
        Word word5 = new Word("kinds");
        Word word6 = new Word("of");
        Word word7 = new Word("animals");
        Word word8 = new Word("on");
        Word word9 = new Word("our");
        Word word10 = new Word("planet");
        Word word11 = new Word("very");
        Word word12 = new Word("beautiful");
        Word word13 = new Word("and");
        Word word14 = new Word("unusual");
        Sentence header = new Sentence(word1);
        Sentence sentence1 = new Sentence(new Word[]{word2, word3, word4, word5, word6, word7, word8, word9, word10});
        Sentence sentence2 = new Sentence(new Word[]{word1, word3, word11, word12, word13, word14, word7});
        Text text = new Text(header, new Sentence[]{sentence1});
        System.out.println(text.getHeader());
        System.out.println(text.getText());
        text.addText(new Sentence[]{sentence2});
        System.out.println(text.getText());
    }
}
