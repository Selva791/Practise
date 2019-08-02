package com.datastructure;

import com.practice.waste.Node;

public class TreeDFS {
	Node root;
	private void printPreorder(Node node) {
		if(node==null) {
			return ;
		}
			//System.out.println(node.data);
			printPreorder(node.left);
			
			printPreorder(node.right);
			System.out.println(node.data);
			
		
		
	}
public static void main(String[] args) {
	TreeDFS tree=new TreeDFS();
	tree.root = new Node(1); 
    tree.root.left = new Node(2); 
    tree.root.right = new Node(3); 
    tree.root.left.left = new Node(4); 
    tree.root.left.right = new Node(5);
    System.out.println("Preorder traversal of binary tree is "); 
    tree.printPreorder(tree.root); 
}


}
