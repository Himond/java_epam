package by.jonline.basicsofsoftwarecodedev.linear;

/* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.*/

public class FourthTask {
    public static void main(String[] args) {
        double i = 265.757;
        System.out.println(reversNumber(i));
        System.out.println(reversNumberString(i));

    }
    // Первый способ
    public static double reversNumber(double num){
        double x;
        double y;
        double result;
        x = Math.floor(num) / 1000;
        y = Math.round(num % 1 * 1000);
        result = x + y;
        return result;
    }
    // Второй способ
    public static double reversNumberString(double num){
        String[] arr;
        arr = Double.toString(num).split("\\.");
        return Double.parseDouble(arr[1] + '.' + arr[0]);
    }
}

