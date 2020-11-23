package by.jonline.stringsandbasic.stringasarray;

/*В строке найти количество чисел.*/

public class FourthTask {
    public static void main(String[] args) {

        String str = "4Hello 33 world 34, letter 0.3, 25, wor54d8,0.44432!";
        System.out.println(countNumber(str));

    }

    public static int countNumber(String str){

        int count = 0;
        String num = "";

        for(int i = 0; i < str.length(); i++){
            if((str.charAt(i) >= 48 && str.charAt(i) <= 57) || (i < (str.length() - 1) &&
                    str.charAt(i + 1) >= 48 && str.charAt(i + 1) <= 57  && str.charAt(i) == '.' && num.length() != 0)){
                num += str.charAt(i);
            }else {
                if(num.length() != 0){
                    count += 1;
                    num = "";
                }
            }

        }
        return count;
    }

}
