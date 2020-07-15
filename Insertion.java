import java.util.*;
import java.io.*;
class Insertion{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                  arr[i] = sc.nextInt();
            }
            InsertionSort(arr,n);
      }

      public static void InsertionSort(int[] ar,int n){
            for(int i=1;i<n;i++){
                  int key = ar[i];
                  int j = i-1;
                  while(j>=0 && ar[j]>key){
                        ar[j+1] = ar[j];
                        j=j-1;
                  }
                  ar[j+1] = key;
            }
            System.out.println(Arrays.toString(ar));
      }
}