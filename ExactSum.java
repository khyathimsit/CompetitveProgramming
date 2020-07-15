/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class ExactSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		for(int i=0;i<test;i++){
			String[] tokens = sc.nextLine().split(" ");
			int n = Integer.parseInt(tokens[0]);
			int val = Integer.parseInt(tokens[1]);
			String[] arr1 = sc.nextLine().split(" ");;
			int[] arr = new int[n];
			for(int j=0;j<n;j++){
				arr[j] = Integer.parseInt(arr1[j]);
			}
			int c= 0; 
			for(int l=0;l<n;l++){
				for(int j=l+1;j<n;j++){
					for(int k=l+2;k<n;k++){
						int s= arr[l]+arr[j]+arr[k];
						if(s == val)
							c++;
					}
				}
			}
			if(c>1){
				System.out.println("1");
			}else{
				System.out.println("0");
			}
		}
	}
}