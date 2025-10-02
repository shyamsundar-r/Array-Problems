import java.util.*;
public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) return n;
        int j = 0; 
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n - 1];
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int newLength = removeDuplicates(arr);
        System.out.println("Array after removing duplicates: " 
            + Arrays.toString(Arrays.copyOf(arr, newLength)));
    }
}
