package by.jonline.stringsandbasic.stringasobject;
/* Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef".
*/
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
