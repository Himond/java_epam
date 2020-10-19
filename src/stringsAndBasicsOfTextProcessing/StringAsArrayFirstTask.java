package stringsAndBasicsOfTextProcessing;

public class StringAsArrayFirstTask {
    public static void main(String[] args) {
        String[] str = {"variableNewA", "variableNewB", "variableNewC"};
        String B = "AfdsfaAFF";
        for (int i = 0; i < B.length(); i++) {
            System.out.println(B + "C");
        }
        System.out.println(B);



    }
    public String[] toSnakeCase(String[] str){
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if(str[i].charAt(j) > 65){

                }
            }
        }

        return str;
    }
}
