import java.io.*;
import java.util.*;

class KSmallest{
	class Node{
		int key;
		Node left,right;

		public Node(int val){
			key = val;
			left = right = null;
		}
	}
	Node root;
	KSmallest(){
		root = null;
	}
	public void insert(int key){
		root = insertRec(root,key);
	}
	Node insertRec(Node root, int key){
		if(root == null){
			root = new Node(key);
			return root;
		}
		if(key<root.key){
			root.left = insertRec(root.left,key);
		}
		if(key>root.key){
			root.right = insertRec(root.right,key);
		}
		return root;
	}

	int minvalue(Node node){
		Node current = node;

		while(current.left!=null){
			current = current.left;
		}
		return current.key;
	}
	
	 public class count { 
        int c = 0; 
    } 

	void ksmallest(int k){
		count c = new count();
		this.ksmallestRec(this.root,k, c);
	}

	void ksmallestRec(Node node, int k, count C){
		while(node == null || C.c >= k){
			return;
		}
		ksmallestRec(node.left,k,C);
		C.c++;
		if(C.c == k){
			System.out.println(k+"th smallest element is:" + node.key);
			return;
		}
		ksmallestRec(node.right,k,C);
	}
	public static void main(String[] args) {
		KSmallest bst = new KSmallest();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(70);
		bst.insert(40);
		bst.insert(60);
		bst.insert(80);
		for(int i=0;i<=7;i++){
			bst.ksmallest(i);
		}
	}
}
