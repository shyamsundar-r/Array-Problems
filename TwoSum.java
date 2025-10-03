import java.util.*;
class Main {
    public static int[] simpleArray(int[] arr, int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return new int[]{i,j};                
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int k = 6;
        int[] result = simpleArray(arr1, k);
        if(result != null){
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No pair found");
        }
    }
}
