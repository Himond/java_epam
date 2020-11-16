package by.jonline.stringsandbasics.stringasobject;
/*С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */
public class FourthTask {
    public static void main(String[] args) {
        String word = "информатика";
        System.out.println(toCake(word));

    }
    public static String toCake(String str){
        String cake = "";
        cake = str.charAt(7) + str.substring(3, 5) + str.charAt(7);
        return cake;
    }
}
