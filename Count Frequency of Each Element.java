import java.util.*;
public class FrequencyCount {
    public static void countFrequency(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key));
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};
        countFrequency(arr);
    }
}
