package by.jonline.stringsandbasics.regularexpressions;



public class FirstTask {
    public static void main(String[] args) {
        String str = "Unlike the planets of the earth group that have long been known to astronomers, the spectral pattern is a cross-section. Option shakes far Foucault's pendulum. Maternity time, sublimating from the surface of the comet's core, reflects the perihelion.\n" +
                "The full moon, in the first approximation, illustrates the deep sky object. The movement is vitally illustrated by parallax. The solar Eclipse is accidental.\n" +
                "The annual parallax, at first glance, crosses out the asteroid aphelion.";
        ParseText text = new ParseText(str);
        System.out.println("Оригинальный текст: ");
        System.out.println(text);
        System.out.println();
        System.out.println("Сортировка по количеству предложений: ");
        System.out.println(text.sortingParagraphs());
        System.out.println();
        System.out.println("Сортировка слов по длине в предложении: ");
        System.out.println(text.sortingWordsByLength());
        System.out.println();
        System.out.println("Сортировать лексемы по убыванию количества вхождений заданного символа: ");
        System.out.println(text.sortByCharacter('p'));
    }
}


