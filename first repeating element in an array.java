// Naive Approach - O(n^2) Time and O(1) Space
import java.util.*;
class Main {
    // Function to find the index of first repeating element in an array
    static int firstRepeatingElement(int[] arr, int n) {
        // Nested loop to check for repeating elements
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If a repeating element is found, return its index
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        // If no repeating element is found, return -1
        return -1;
    }

    // Driver code
    public static void main(String[] args) { 
        // Initializing an array and its size
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        int n = arr.length;
        // Finding the index of first repeating element
        int index = firstRepeatingElement(arr, n);
        // Checking if any repeating element is found or not
        if (index == -1) {
            System.out.println("No repeating element found!");
        }
        else {
            System.out.println("First repeating element is " + arr[index]);
        }
    }
}


// Hash Set - O(n) Time and O(n) Space
import java.util.HashSet;
public class FirstRepeating {
    public static int findFirstRepeating(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1; // No repeating element
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        System.out.println("First Repeating: " + findFirstRepeating(arr));
    }
}
