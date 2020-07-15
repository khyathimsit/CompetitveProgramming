import java.io.*;
import java.util.*;

class Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		int left = 0;
		int right = 0;
		for(int j=1;j<n;j++){
			for(int l=0;l<j;l++){
				left+=arr[l];
			}

			for(int r=j+1;r<n;r++){
				right+=arr[r];
			}
			if(left>right){
				System.out.println(j-1);
			}
		}
	}
}