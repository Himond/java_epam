package by.jonline.stringsandbasics.stringasarray;

/*
Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 */

public class FirstTask {
    public static void main(String[] args) {
        String[] str = {"variableNewA", "variableNewB", "variableNewC"};
        toSnakeCase(str);
        for (String s : str) {
            System.out.println(s);
        }
    }
    public static void toSnakeCase(String[] str){
        for (int i = 0; i < str.length; i++) {
            String newStr = "";
            for (int j = 0; j < str[i].length(); j++) {
                if((int)str[i].charAt(j) < 93){
                    newStr += '_';
                    newStr += (char)(32 + str[i].charAt(j));
                }else {
                    newStr += str[i].charAt(j);
                }
            }
            str[i] = newStr;
        }

    }
}
