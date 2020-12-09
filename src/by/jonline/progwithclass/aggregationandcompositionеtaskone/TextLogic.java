package by.jonline.progwithclass.aggregationandcompositionеtaskone;

/*Создать объект класса Текст, используя классы Предложение, Слово.
Методы: дополнить текст, вывести на консоль текст, заголовок текста.*/

import java.util.List;

public class TextLogic {

    public String buildText(List<Sentence> text) {
        StringBuilder newtext = new StringBuilder();
        for(Sentence sen: text){
            for (int j = 0; j < sen.getSentence().size(); j++ ){
                if(j == 0){
                    char[] new_word = sen.getSentence().get(j).getWord().toCharArray();
                    new_word[0] = (char) (new_word[0] - 32);
                    newtext.append(new_word).append(" ");
                }else if(j != sen.getSentence().size() - 1){
                    newtext.append(sen.getSentence().get(j).getWord()).append(" ");
                }else {
                    newtext.append(sen.getSentence().get(j).getWord());
                }
            }
            newtext.append(".").append(" ");
        }
        return newtext.toString();
    }

    public String buildHeader(Sentence header) {
        StringBuilder newHeader = new StringBuilder();
        if (header.getSentence() != null){
            for (int i = 0; i < header.getSentence().size(); i++){
                if (i != header.getSentence().size() - 1){
                    newHeader.append(header.getSentence().get(i).getWord()).append(" ");
                }else {
                    newHeader.append(header.getSentence().get(i).getWord()).append(".");
                }
            }
        }
        return newHeader.toString();
    }



}
