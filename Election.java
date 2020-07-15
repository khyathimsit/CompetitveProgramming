import java.util.*;
import java.lang.*;
import java.io.*;

class Election {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<test;i++){
		    int n = Integer.parseInt(sc.nextLine());
		    String[] names = sc.nextLine().split(" ");
		    election(names);
		}
	}
	
	public static void election(String arr[]){
	    HashMap<String,Integer> hmap = new HashMap<String,Integer>();
	    for(String str:arr){
	        if(hmap.keySet().contains(str)){
	            hmap.put(str,hmap.get(str)+1);
	        } else{
	            hmap.put(str,1);
	        }
	    }
	    int max = 0;
	    String winner = "";
	    for(Map.Entry<String,Integer> entry : hmap.entrySet()){
	        int value = entry.getValue();
	        String key = entry.getKey();
	        if(value > max){
	            winner = key;
	            max = value;
	        }
	        
	        else if(value == max && winner.compareTo(key)>0){
	            max = value;
	            winner = key;
	        }
	    }
	    System.out.println(winner+" "+max);
	}
}