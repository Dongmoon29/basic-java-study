package BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    // Todo
    // {2,3,4,1,5,6} => {1,2,3,4,5,6}
    public static String bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < (arr.length - i - 1); j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
    public static String bubbleSorting(int[] arr) {
        if (arr == null || arr.length == 0) return "Error";
        for(int i = 0; i < arr.length - 1; i ++) {
            for(int j = 0 ; j < (arr.length - 1 - i); j++) {
                int temp;
                if(arr[j] > arr[j+1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
//        System.out.println(BubbleSort.bubbleSort(new int[]{3,2,1}));
        System.out.println(BubbleSort.bubbleSorting(new int[]{3,2,1}));
    }
}
