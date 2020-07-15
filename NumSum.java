import java.util.*;
import java.lang.*;
import java.io.*;

class NumSum {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
		    String test = sc.nextLine();
		    int sum = 0;
		    String str[] = test.split("\\d+");
		    // for(int k=0;k<str.length;k++){
		    // 	System.out.println(str[k]);
		    // }
		    for(int j=0;j<str.length;j++){
		        if(!str[j].isEmpty())
		          sum = sum + Integer.parseInt(str[j]);
		    }
		    System.out.println(sum);
		}
	}
}