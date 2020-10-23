package stringsandbasics;

import java.util.Arrays;

public class StringAsObjectTenthTask {
    public static void main(String[] args) {
        String str = "That. PAPER. is way, way beyond. Anything You're! LikeLy to be taught? at the. AcAdEmY.";
        System.out.println(countSentences(str));
    }
    public static int countSentences(String str){
        return str.split("[!?.]").length;
    }
}
