package by.jonline.stringsandbasic.stringasarray;
/*В строке найти количество цифр.*/
public class ThirdTask {
    public static void main(String[] args) {
        String str = "Hello 33 world 34, letter 3, 25, wor5d!";
        System.out.println(countDig(str));
    }

    public static int countDig(String str){
        int count = 0;
        for(char elem: str.toCharArray()){
            count += (elem >= 48 && elem <= 57) ? 1 : 0;
        }
        return count;
    }
}
