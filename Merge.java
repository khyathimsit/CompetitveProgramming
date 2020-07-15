import java.util.*;
import java.io.*;
class Merge{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                  arr[i] = sc.nextInt();
            }
            MergeSort(arr,n);
      }

      public static void MergeSort(int[] ar,int n){
            
            System.out.println(Arrays.toString(ar));
      }
}