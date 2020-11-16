package by.jonline.algorithmization.onedimensionalarrays;
/*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
*/
public class SixthTask {
    public static void main(String[] args) {
        double[] arr = {2.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        sumNum(arr);
    }

    public static void sumNum(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            int delcount = 0;
            for (int j = 0; j <= Math.sqrt(i); j++){
                delcount += (j != 0 && i % j == 0) ? 1 : 0;
            }
            sum += delcount < 2 ? arr[i] : 0;
        }
        System.out.println(sum);
    }
}
