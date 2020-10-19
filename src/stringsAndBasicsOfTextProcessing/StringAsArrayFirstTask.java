package stringsAndBasicsOfTextProcessing;

public class StringAsArrayFirstTask {
    public static void main(String[] args) {
        String[] str = {"variableNewA", "variableNewB", "variableNewC"};
        for (String s : toSnakeCase(str)) {
            System.out.println(s);
        }
    }
    public static String[] toSnakeCase(String[] str){
        for (int i = 0; i < str.length; i++) {
            String newStr = "";
            for (int j = 0; j < str[i].length(); j++) {
                if((int)str[i].charAt(j) < 93){
                    newStr += '_';
                    newStr += (char)(32 + (int)str[i].charAt(j));
                }else {
                    newStr += str[i].charAt(j);
                }
            }
            str[i] = newStr;
        }

        return str;
    }
}
