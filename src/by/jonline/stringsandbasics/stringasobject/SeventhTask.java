package by.jonline.stringsandbasics.stringasobject;

import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(delRepeatChar(str));
    }
    public static String delRepeatChar(String str){
        StringBuilder newStr = new StringBuilder();
        for(char elem: str.toCharArray()){
            if(newStr.toString().indexOf(elem) == -1 && elem != ' '){
                newStr.append(elem);
            }
        }
        return newStr.toString();
    }
}
