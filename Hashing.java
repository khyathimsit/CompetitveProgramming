import java.util.*;
import java.lang.*;
import java.io.*;

class Hashing {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0;i<test;i++){
		    int n = sc.nextInt();
		    int[] arr1 = new int[n];
		    for(int j=0;j<n;j++){
		        arr1[j] = sc.nextInt();
		    }
		    int[] arr2 = new int[n];
		    for(int j=0;j<n;j++){
		        arr2[j] = sc.nextInt();
		    }
		    if(equal(arr1,arr2)){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("0");
		    }    
		}
	}
	
	public static boolean equal(int[] a, int[] b){
	    HashMap<Integer,Integer> hmap = new HashMap<>();
	    int count=0;
	    for(int i=0;i<a.length;i++){
	        if(hmap.get(a[i]) == null){
	            hmap.put(a[i],1);
	        } else{
	            count = hmap.get(a[i]); 
                count++; 
                hmap.put(a[i], count); 
	        }
	    }
	    for (int i = 0; i < a.length; i++) { 
            if (!hmap.containsKey(b[i])) 
                return false; 
            if (hmap.get(b[i]) == 0) 
                return false; 
  
            count = hmap.get(b[i]); 
            --count; 
            hmap.put(b[i], count); 
        } 
        return true; 
	}
}