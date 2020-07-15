import java.io.*;
import java.util.*;
import java.lang.Math;

class Binary{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String val = Integer.toBinaryString(n);
		//System.out.println(val);
		int count = 0;
		int max = 0;
		for(int i=0;i<val.length();i++){
			if(val.charAt(i) == '1'){
				count++;
				if(max < count){
					max = count;
				}
			} else if(val.charAt(i) == '0'){
				count = 0;
			}
		}
		System.out.println(max);
	}
}