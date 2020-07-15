import java.io.*;
import java.util.*;

class Atoms{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Map<String,Integer> tmap = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++){
			int count = 0;
			char c = s.charAt(i);
			String str = " ";
			str = String.valueOf(c);
			if (str.matches("[A-Z]")) { 
                for (int j = i + 1; j < s.length(); j++) { 
                    char d = s.charAt(j); 
                    String str1 = String.valueOf(d); 
                    if (str1.matches("[a-z]")) { 
                        str += str1; 
                        if (tmap.get(str) == null) 
                            tmap.put(str, 1); 
                        else
                            tmap.put(str, tmap.get(str) + 1); 
                        count = 1; 
                    } 
                    else if (str1.matches("[\\d]")) { 
                        int k = Integer.parseInt(str1); 
                        tmap.put(str, k); 
                        count = 1; 
                    } 
                    else { 
                        i = j - 1; 
                        break; 
                    } 
                } 
                if (count == 0) { 
                    if (tmap.get(str) == null) 
                        tmap.put(str, 1); 
                    else
                        tmap.put(str, tmap.get(str) + 1); 
                } 
            }
		}
		String res = "";
		for (Map.Entry<String, Integer> entry : tmap.entrySet()) {
			res+=entry.getKey();
		    if(entry.getValue() == 1){
		    	res+="";
		    }else{
		    	res += entry.getValue();
		    }
		}
	}
}