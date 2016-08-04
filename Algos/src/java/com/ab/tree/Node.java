package com.ab.tree;

public class Node {

	int val;
	Node left;
	Node right;
	
	public Node(int val, Node left, Node right) {
		
		this.val = val;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [val=" + val + ", left=" + left + ", right=" + right + "]";
	}
	
	
}
