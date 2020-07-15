import java.io.*;
import java.util.*;

class BinarySearchTree{
	class Node{
		int key;
		Node left,right;

		public Node(int val){
			key = val;
			left = right = null;
		}
	}
	Node root;
	BinarySearchTree(){
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

	Node lca(Node node, int a , int b){
		if(node == null)
			return null;
	    if(a < node.key && b < node.key)
	    	return lca(node.left,a,b);
	    if(a > node.key && b > node.key)
	    	return lca(node.right,a,b);
	    return node;
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(70);
		bst.insert(40);
		bst.insert(60);
		bst.insert(80);

		int n1 = 40;
		int n2 = 70;
		Node t = bst.lca(bst.root,n1,n2);
		System.out.println(t.key);
	}
}