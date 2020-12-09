package by.jonline.progwithclass.aggregationandcompositionеtaskone;

/*Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
вывести на консоль текст, заголовок текста.*/

public class MainText {
    public static void main(String[] args) {

        TextLogic logic = new TextLogic();

        Word word1 = new Word("Основы");
        Word word2 = new Word("классов");
        Word word3 = new Word("и");
        Word word4 = new Word("объектов");
        Word word5 = new Word("Java");
        Word word6 = new Word("классы");
        Word word7 = new Word("в");
        Word word8 = new Word("языке");
        Word word9 = new Word("объединяют");
        Word word10 = new Word("поля");
        Word word11 = new Word("класса,");
        Word word12 = new Word("методы,");
        Word word13 = new Word("конструкторы,");
        Word word14 = new Word("логические");
        Word word15 = new Word("блоки");
        Word word16 = new Word("внутренние");


        Sentence header = new Sentence();
        header.setSentence(word1);
        header.setSentence(word2);
        header.setSentence(word3);
        header.setSentence(word4);
        header.setSentence(word5);

        Sentence sentence = new Sentence();
        sentence.setSentence(word6);
        sentence.setSentence(word7);
        sentence.setSentence(word8);
        sentence.setSentence(word5);
        sentence.setSentence(word9);
        sentence.setSentence(word10);
        sentence.setSentence(word11);
        sentence.setSentence(word12);
        sentence.setSentence(word13);
        sentence.setSentence(word14);
        sentence.setSentence(word15);
        sentence.setSentence(word3);
        sentence.setSentence(word16);
        sentence.setSentence(word6);

        Text text = new Text(header);
        text.setText(sentence);

        System.out.println(logic.buildHeader(text.getHeader()));
        System.out.println(logic.buildText(text.getText()));


    }
}
