import java.io.*;
import java.util.*;

class KLargest{
	class Node{
		int key;
		Node left,right;

		public Node(int val){
			key = val;
			left = right = null;
		}
	}
	Node root;
	KLargest(){
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

	void klargest(int k){
		count c = new count();
		this.klargestRec(this.root,k, c);
	}

	void klargestRec(Node node, int k, count C){
		while(node == null || C.c >= k){
			return;
		}
		klargestRec(node.right,k,C);
		C.c++;
		if(C.c == k){
			System.out.println(k+"th largest element is:" + node.key);
			return;
		}
		klargestRec(node.left,k,C);
	}
	public static void main(String[] args) {
		KLargest bst = new KLargest();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(70);
		bst.insert(40);
		bst.insert(60);
		bst.insert(80);
		for(int i=0;i<=3;i++){
			bst.klargest(i);
		}
	}
}