import java.io.*;
import java.util.*;

class Stock{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(",");
		int[] values = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			values[i] = Integer.parseInt(arr[i]);
		}
		int minval = values[0];
		for(int j=0;j<arr.length;j++){
			minval = Math.min(minval,values[j]);
		}
		int index = 0;
		for(int l=0;l<arr.length;l++){
			if(values[l] == minval){
				index = l;
			}
		}
		int maxval = 0;
		System.out.println(Arrays.toString(values));
		System.out.println(index);
		for(int k=index+1;k<arr.length;k++){
			maxval = Math.max(maxval,values[k]);
		}
		System.out.println(minval+","+maxval);
	}
}