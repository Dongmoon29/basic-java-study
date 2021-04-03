package InsertSort;

import java.util.Arrays;

public class InsertSort {
    public static String sort(int[] arr) {
        int i, j, temp;
        // outer loop
        for(i = 1; i < arr.length; i++) {
            j = i;
            while(j > 0 && arr[j] < arr[j - 1]) {// 판단 부분
                // 스왑부분
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
             }
        }

        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        System.out.println(InsertSort.sort(new int[]{2,5,4,6,1,3}));
    }
}
