package basicsofsoftwarecodedev;

public class LoopFifthTask {
    public static void main(String[] args) {

        System.out.println(sumFunc(new int[]{-2, -5, 7, -5, -8, 3, 4}, 275));

    }
    public static double sumFunc(int[] num, double e){
        double sum = 0;
        for (int j : num) {
            double an = ((1 / Math.pow(2, j)) + (1 / Math.pow(3, j)));
            sum += Math.abs(an) >= e ? an : 0;
        }
        return sum;
    }
}
