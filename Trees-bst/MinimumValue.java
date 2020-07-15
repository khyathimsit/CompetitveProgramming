import java.io.*;
import java.util.*;

class MinimumValue{
	class Node{
		int key;
		Node left,right;

		public Node(int val){
			key = val;
			left = right = null;
		}
	}
	Node root;
	MinimumValue(){
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
	
	public static void main(String[] args) {
		MinimumValue bst = new MinimumValue();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(70);
		bst.insert(40);
		bst.insert(60);
		bst.insert(80);
		System.out.println("Min value in bst is :" + bst.minvalue(bst.root));
	}
}