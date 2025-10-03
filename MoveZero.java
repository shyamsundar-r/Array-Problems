import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={1,2,0,9,0,4};
        int h=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                if(i!=h){
                    arr[h]=arr[i];
                    arr[i]=0;
                }
                h++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
