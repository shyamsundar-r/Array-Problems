import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of Elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the values:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max = a[0];
        for(int num:a){
            if(num>max){
                max = num;
            }
        }
        System.out.print("Maximum value:"+max);
    }
}
