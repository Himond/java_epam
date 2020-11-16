package by.jonline.algorithmization.decomposition;

public class FifthTask {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,4 ,5 ,6 ,7 ,9};
        secondBySize(arr);
    }
    public static void secondBySize(int[] arr){
        int maxNum = 0;
        int secNum = 0;
        for (int elem: arr) {
            maxNum = elem > maxNum ? elem : maxNum;
        }
        for (int secondelem: arr) {
            secNum = secondelem < maxNum && secondelem > secNum ? secondelem : secNum;
        }
        System.out.println(secNum);
    }
}
