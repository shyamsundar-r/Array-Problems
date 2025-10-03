import java.util.HashSet;

public class CommonElements {
    public static void findCommon(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) set.add(num);

        System.out.print("Common Elements: ");
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
                set.remove(num); // to avoid duplicates in output
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        findCommon(arr1, arr2);
    }
}
