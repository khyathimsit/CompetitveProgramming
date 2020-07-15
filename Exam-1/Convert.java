import java.util.*;
import java.io.*;
class Convert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] words = sc.nextLine().split(",");
		HashMap<String,String> hmap = new HashMap<>();
		hmap.put("A",".-");
		hmap.put("B","-...");
		hmap.put("C","-.-.");
		hmap.put("D","-..");
		hmap.put("E",".");
		hmap.put("F","..-.");
		hmap.put("G","--.");
		hmap.put("H","....");
		hmap.put("I","..");
		hmap.put("J",".---");
		hmap.put("K","-.-");
		hmap.put("L",".-..");
		hmap.put("M","--");
		hmap.put("N","-.");
		hmap.put("O","---");
		hmap.put("P",".--.");
		hmap.put("Q","--.-");
		hmap.put("R",".-.");
		hmap.put("S","...");
		hmap.put("T","-");
		hmap.put("U","..-");
		hmap.put("V","...-");
		hmap.put("W",".--");
		hmap.put("X","-..-");
		hmap.put("Y","-.--");
		hmap.put("Z","--..");

HashMap<String,Integer> result = new HashMap<>();

		for(int i=0;i<words.length;i++){
			String word = words[i].toUpperCase();
			String res = "";
			for(int j=0;j<word.length();j++){
				char val = word.charAt(j);
				String value = Character.toString(val);
				//res.append(hmap.get(value));
				res = res + hmap.get(value);
			}
			
			if(result.containsKey(res)){
				result.put(res,result.get(res)+1);
			} else{
				result.put(res,1);
			}
			res = "";
		}
		System.out.println(result.size());
	}
}