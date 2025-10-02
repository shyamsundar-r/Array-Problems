public class CheckSorted {
    public static String checkSorted(int[] arr) {
        boolean asc = true, desc = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) asc = false;
            if (arr[i] > arr[i - 1]) desc = false;
        }
        if (asc) return "Ascending";
        if (desc) return "Descending";
        return "Not Sorted";
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {10, 5, 1};
        int[] arr3 = {3, 2, 4};
        System.out.println(checkSorted(arr1));
        System.out.println(checkSorted(arr2)); 
        System.out.println(checkSorted(arr3)); 
    }
}
