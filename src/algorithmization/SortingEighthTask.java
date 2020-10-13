package algorithmization;

import java.util.Arrays;

public class SortingEighthTask {
    public static void main(String[] args) {
        String[] arr = {"1/2", "-2/3", "1/3", "2/4", "1/6"};
        fractionsSort(arr);
        sortShell(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void fractionsSort(String[] arr){
        int commonDem = 0;
        int count = 1;
        for (String s : arr) {
            String[] fractNum = s.split("/");
            int denominator = Integer.parseInt(fractNum[1]);
            if (commonDem < denominator) {
                commonDem = denominator;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            String[] fractNum = arr[i].split("/");
            int denominator = Integer.parseInt(fractNum[1]);
            if((commonDem * count) % (denominator) != 0){
                i = 0;
                count++;
            }
        }
        int newDenom = commonDem * count;
        for (int j = 0; j < arr.length; j++) {
            String[] fractNum = arr[j].split("/");
            int numerator = Integer.parseInt(fractNum[0]);
            int denominator = Integer.parseInt(fractNum[1]);
            int newNum = newDenom / denominator * numerator;
            arr[j] = newNum + "/" + newDenom;
        }

    }

    public static void sortShell(String[] arr){
        int i = 0;
        while (i < arr.length - 1){
            String[] fractNum1 = arr[i].split("/");
            String[] fractNum2 = arr[i + 1].split("/");
            int numerator1 = Integer.parseInt(fractNum1[0]);
            int numerator2 = Integer.parseInt(fractNum2[0]);
            if(numerator1 > numerator2){
                String key = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = key;
                if(i != 0){
                    i--;
                }
            }else {
                i++;
            }
        }
    }

}
