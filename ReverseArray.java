import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] a = {1,3,5,6,3,7};
        int start=0, end= a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array:"+Arrays.toString(a));
    }
}
