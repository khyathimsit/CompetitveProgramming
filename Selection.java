import java.util.*;
import java.io.*;
class Selection{
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                  arr[i] = sc.nextInt();
            }
            SelectionSort(arr,n);
      }

      public static void SelectionSort(int[] ar,int n){
            for(int i=0;i<n;i++){
                  int min = i;
                  for(int j=i+1;j<n;j++){
                        if(ar[j]<ar[min]){
                              min = j;
                        }
                  }
                  int temp = ar[min];
                  ar[min] = ar[i];
                  ar[i] = temp;
            }
            System.out.println(Arrays.toString(ar));
      }
}