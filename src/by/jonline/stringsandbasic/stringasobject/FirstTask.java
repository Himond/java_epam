package by.jonline.stringsandbasic.stringasobject;

/*Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем*/

public class FirstTask {
    public static void main(String[] args) {
        String text = "First of all, there are  fragments of the original    text - words from the author are included here inthe archaic language.";
        System.out.println(maxSpace(text));
    }

    public static int maxSpace(String str){
        int maxCount = 0;
        int count = 0;
        for (char elem: str.toCharArray()) {
            if (elem == ' '){
                count += 1;
            }else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        return maxCount;
    }
}
