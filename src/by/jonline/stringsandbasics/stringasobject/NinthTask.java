package by.jonline.stringsandbasics.stringasobject;

public class NinthTask {
    public static void main(String[] args) {
        String str = "That PAPER is way, way beyond Anything You're LikeLy to be taught at the AcAdEmY.";
        countChar(str);
    }
    public static void countChar(String str){
        int count_a = 0;
        int count_A = 0;
        for(char elem: str.toCharArray()){
            count_A += elem >= 65 && elem <= 90 ? 1 : 0;
            count_a += elem >= 97 && elem <= 122 ? 1 : 0;
        }
        System.out.println("Количество строчных букв: " + count_a);
        System.out.println("Количество прописных букв: " + count_A);
    }
}
