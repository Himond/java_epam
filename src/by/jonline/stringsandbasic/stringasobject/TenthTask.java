package by.jonline.stringsandbasic.stringasobject;
/*Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
*/
public class TenthTask {
    public static void main(String[] args) {
        String str = "That. PAPER. is way, way beyond. Anything You're! LikeLy to be taught? at the. AcAdEmY.";
        System.out.println(countSentences(str));
    }
    public static int countSentences(String str){
        return str.split("[!?.]").length;
    }
}
