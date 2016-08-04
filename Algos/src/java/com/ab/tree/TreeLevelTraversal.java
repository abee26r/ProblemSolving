package com.ab.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelTraversal {

	public void travLevel(Node n){
		
		Queue<Node> q = new LinkedList<>();
		q.offer(n);
		q.offer(null);
		while(!q.isEmpty()){
			
			Node curr = q.poll();
			if(curr!= null){
				System.out.print(curr.val + "___");
				if(curr.left != null){
					q.offer(curr.left);
				}
				if(curr.right != null){
					q.offer(curr.right);
				}
			}else{
				System.out.println();
				if(!q.isEmpty())
				q.offer(null);
			}
		}
		System.out.println("Done");
		
	}
}
