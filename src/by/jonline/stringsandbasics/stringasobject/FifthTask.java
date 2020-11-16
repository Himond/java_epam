package by.jonline.stringsandbasics.stringasobject;

public class FifthTask {
    public static void main(String[] args) {
        String str = "That paper is way, way beyond Anything you're likely to be taught at the Academy.";
        System.out.println(countA(str));
    }
    public static int countA(String str){
        int count = 0;
        for (char elem:str.toLowerCase().toCharArray()) {
            count += elem == 'a' ? 1 : 0;
        }
        return count;
    }
}
