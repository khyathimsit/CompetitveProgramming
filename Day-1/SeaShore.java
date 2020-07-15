import java.util.*;
import java.io.*;
 
class SeaShore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = sc.nextLine().split(",");
		int[] tokens = new int[arr.length];
		for(int l=0;l<tokens.length;l++){
			tokens[l] = Integer.parseInt(arr[l]);
		}

		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		int max = tokens[tokens.length - 1];
		list.add(max);

		for(int i= tokens.length-1; i>=0;i--){
			if(tokens[i] < tokens[i-1]) {
				max = tokens[i-1];
				count++;
				list.add(max);
			}
		}	
		System.out.println("count" +count);

		for(int j=0;j<list.size();j++){
			System.out.println(list.get(j));
		}
	}
}