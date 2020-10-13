package algorithmization;

public class SortingSeventhTask {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 7, 8, 9, 10};
        int[] arr2 = {-4, -5, -6, -8, 6, 11};
        int count = 0;
        for (int j : arr2) {
            int posKey = binSearch(arr1, j);
            System.out.println(posKey + count);
            count++;
        }
    }

    public static int binSearch(int[] arr, int key){
        int left = -1;
        int right = arr.length;
        while (left < right - 1){
            int mid = (left + right)/2;
            if(arr[mid] < key){
                left = mid;
            }else {
                right = mid;
            }
        }
        return right;
    }
}
