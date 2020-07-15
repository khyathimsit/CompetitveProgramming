import java.util.*;
import java.lang.*;
import java.io.*;

class Maxproduct {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0;i<test;i++){
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    for(int j=0;j<n;j++){
		    	arr[j] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    int result = arr[n-1]*arr[n-2]; 
		    System.out.println(result);   
		}
	}
}