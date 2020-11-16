package by.jonline.algorithmization.decomposition;

public class FourteentTask {
    public static void main(String[] args) {
        try {
            ArmstrongNumbers arms = new ArmstrongNumbers(16000);
            arms.getArmNums();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
class ArmstrongNumbers{

    private final int left;
    private final int right;

    public ArmstrongNumbers(int k) throws ArithmeticException{
        if(k < 2){
            throw new ArithmeticException("Введите число >= 2");
        }
        left = 1;
        right = k;
    }

    public void getArmNums(){
        int[] arr;
        StringBuilder s = new StringBuilder();
        for (int i = left; i <= right; i++) {
            arr = getArr(i);
            if (checkArmNums(arr, i)){
                s.append(i).append(" ");
            }
        }
        if(s.length() == 0){
            System.out.println("В диапазоне от " + left + " до " + right + ": нет чисел Армстронга" );
        }else {
            System.out.println("Числа Армстронга в диапазоне от " + left + " до " + right + ": " + s);
        }

    }

    private boolean checkArmNums(int[] arr, int num){
        int sum = 0;
        for (int j : arr) {
            sum += Math.pow(j, arr.length);
        }
        return sum == num;
    }

    private int[] getArr(int N){
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

}

