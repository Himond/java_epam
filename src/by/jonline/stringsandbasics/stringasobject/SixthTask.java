package by.jonline.stringsandbasics.stringasobject;
/*Из заданной строки получить новую, повторив каждый символ дважды*/
public class SixthTask {
    public static void main(String[] args) {
        String str = "That paper is way, way beyond Anything you're likely to be taught at the Academy.";
        System.out.println(doubleStr(str));
    }
    public static String doubleStr(String str){
        StringBuilder newStr = new StringBuilder();
        for (char elem: str.toCharArray()) {
            newStr.append(elem).append(elem);
        }
        return newStr.toString();
    }
}
