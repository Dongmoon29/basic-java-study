package DuplicateNumber;

public class DuplicateNumber {
    // 1,2,3,3,5,6,7
    public static Boolean isDuplicateNumber(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i+1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(DuplicateNumber.isDuplicateNumber(new int[]{1, 2, 3, 4, 4, 5}));
    }
}