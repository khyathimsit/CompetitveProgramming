import java.util.*;
import java.io.*;
class Zuma{
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// String table = sc.nextLine();
		// String hand = sc.nextLine();
	// 	int count = 0;
	// 	for(int i=0;i<table.length();i++){
	// 		char c1 = table.charAt(i);
	// 		char c2 = table.charAt(i+1);
	// 		if(c1==c2){
	// 			if(hand.contains("c1")){
	// 				count++;
	// 			}
	// 			table = table.replace(c1,"");
	// 			hand = hand.replace(c1,"");
	// 		}
	// 	}
	// 	if(table.length == 2){
	// 		System.out.println("-1");
	// 	} else{
	// 		System.out.println(count);
	// 	}
	// }
	String table = "WWRRBBWW";
	String hand = "WRBRW";
	String[] arr = hand.split("");
	ArrayList<String> alist = new ArrayList<>();
	for(int i=0;i<hand.length();i++){
		alist.add(arr[i]);
	}
	int count = 0;
    while(table.length() != 0){
        int j = 0;
        int k = 0;
        int flag = 0;
        for( j = 0;j<table.length()-1;j++){
            flag = 0;
            k = j+1;
            if(table.charAt(j) == table.charAt(k)){
                if(alist.contains(table.charAt(j))){
                    flag = 1;
                    alist.remove(table.charAt(j));
                    count = count+1;
                    break;
                }
            }
        }
        if(flag == 1){
            String str1 = table.substring(0,j);
            String str2 = table.substring(k+1,table.length());
            table = str1+str2;
        }
        if(flag == 0){
            System.out.println("-1");
            break;
        }
    }
    if(table.length() == 0){
        System.out.println(count);
    }
}
}