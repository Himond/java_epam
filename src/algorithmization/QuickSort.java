package algorithmization;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = { 4, 5, 3, 8, 1, 2} ;
        QuickSort.qsort(a);
        System.out.println(Arrays.toString(a));

    }

    static void qsort(int items[]){
        qs(items, 0, items.length-1);
    }

    private static void qs(int items[], int left, int right) {
        int i, j, y;
        i = left;
        j = right;
        int x = items[(right + left) / 2];

        do {
            while (items[i] < x && i < right) {
                i++;
            }
            while (x < items[j] && j > left) {
                j--;
            }
            if (i <= j) {
                y = items[i];
                items[i] = items[j];
                items[j] = y;
                i++;
                j--;
            }
        }while (i <= j);
        if(left < j){
            qs(items, left, j);
        }
        if(i < right){
            qs(items, i, right);
        }
    }

}
