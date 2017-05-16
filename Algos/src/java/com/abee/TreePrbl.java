package com.abee;

public class TreePrbl {

	 /* Driver program to test the above functions */
    public static void main(String[] args) 
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        System.out.println("Spiral order traversal of Binary Tree is ");
        printSpiral(root, true);
    }
    public static void printSpiral(Node n, boolean boo) {
		// TODO Auto-generated method stub
		
	}
}


class Node 
{

    int data;
    Node left, right;
  
    public Node(int d) 
    {
        data = d;
        left = right = null;
    }
}
  