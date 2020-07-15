import java.util.*;
import java.io.*;
class Hamming{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(",");
		int x = Integer.parseInt(arr[0]);
		int y = Integer.parseInt(arr[1]);
		int count = 0;
		int[] one = dectoBin(x);
		int[] two = dectoBin(y);
		for(int i=0;i<one.length;i++){
			if(one[i] != two[i]){
				count++;
			}
		}
		System.out.println(count);
	}
	public static int[] dectoBin(int n){
		int[] arr = new int[8];
		int i=0;
		while(n>0){
			arr[i] = n%2;
			n = n/2;
			i++;
		}
		int[] arr1 = new int[8];
		int k=0;
		for(int j=arr.length-1;j>=0;j--){
			arr1[k] = arr[j];
			k++;
		}
		return arr1;
	}
}