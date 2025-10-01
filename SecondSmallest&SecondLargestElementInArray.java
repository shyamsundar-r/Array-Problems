import java.util.*;
public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr ={1, 3, 5, 6, 3, 7};
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr){
            set.add(num);
        }
        Integer[] arr1 = set.toArray(new Integer[0]);
        System.out.println("Second largest: " + arr1[arr1.length - 2]);
        System.out.println("Second smallest: " + arr1[1]);
    }
}
