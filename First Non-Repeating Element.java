import java.util.HashMap;

public class FirstNonRepeating {
    public static int findFirstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (freq.get(num) == 1) {
                return num;
            }
        }
        return -1; // No non-repeating
    }

    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4};
        System.out.println("First Non-Repeating: " + findFirstNonRepeating(arr));
    }
}
