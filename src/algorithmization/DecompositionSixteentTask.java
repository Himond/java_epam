package algorithmization;

public class DecompositionSixteentTask {
    public static void main(String[] args) {
        SummaOddNum sum = new SummaOddNum(2);
        System.out.println(sum.getSumOddNums());
        System.out.println(sum.getTotalEvenNums());
    }

    static class SummaOddNum{

        private final int left;
        private final int right;
        private final int TEN = 10;

        public SummaOddNum(int n) throws ArithmeticException{
            if(n <= 0){
                throw new ArithmeticException("Введите число больше 0");
            }
            left = (int)Math.pow(TEN, n - 1);
            right = (int)Math.pow(TEN, n);
        }

        public int getSumOddNums(){
            int sum = 0;
            int[] arr;
            for (int i = left; i < right; i++) {
                arr = getArrOfNumbers(i);
                if (checkOddNums(arr)){
                    sum += i;
                }
            }
            return sum;
        }

        private int[] getArrOfNumbers(int N){
            int del = 1;
            int lenArr = 0;
            int num = 0;
            do {
                lenArr += 1;
                del *= 10;
            } while (N / del != 0);
            int[] arr = new int[lenArr];
            for (int i = 0; i < arr.length; i++) {
                del /= 10;
                arr[i] = N / del - num;
                num = N / del * 10;
            }
            return arr;
        }

        private boolean checkOddNums(int[] arr){
            boolean check = true;
            for (int j : arr) {
                if (j % 2 == 0) {
                    check = false;
                    break;
                }
            }
            return check;
        }

        private int getTotalEvenNums(){
            int total = 0;
            int sum = getSumOddNums();
            int[] arr = getArrOfNumbers(sum);
            for (int j : arr) {
                if (j % 2 == 0) {
                    total += 1;
                }
            }
            return total;
        }

    }
}
