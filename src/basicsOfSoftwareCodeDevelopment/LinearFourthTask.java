package basicsOfSoftwareCodeDevelopment;

public class LinearFourthTask {
    public static void main(String[] args) {
        double i = 265.757;
        System.out.println(reversNumber(i));
        System.out.println(reversNumberString(i));

    }
    // Первый способ
    public static double reversNumber(double num){
        double x = Math.floor(num) / 1000;
        double y = Math.round(num % 1 * 1000);
        return x + y;
    }
    // Второй способ
    public static double reversNumberString(double num){
        String[] arr = Double.toString(num).split("\\.");
        return Double.parseDouble(arr[1] + '.' + arr[0]);
    }
}

