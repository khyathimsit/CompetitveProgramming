import java.io.*;
import java.util.*;

class TripletSum {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			HashSet<Integer> h = new HashSet<>();
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				h.add(a[i]);
			}
			int c= 0; 
			for(int i=0;i<n;i++){
				for(int j=i+1;j<n;j++){
					int s= a[i]+a[j];
					if(h.contains(s))
						c++;
				}
			}
			if(c==0)
				c=-1;
			System.out.println(c);
		}
	}
}