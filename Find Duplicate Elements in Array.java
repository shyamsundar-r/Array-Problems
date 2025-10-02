// Method 1: Using a HashSet
import java.util.HashSet;
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 6, 8};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}

// Brute Force
import java.util.*;
public class Main {
   public static void main(String[] args){
       int[] arr = {1,2,2,3,3,4,5,6,7,7};
       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   System.out.println("Duplicated Elements:"+arr[i]);
                   break;
               }
           }
       }
   }
}
   
