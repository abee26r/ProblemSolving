package com.ab.tree;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//@RunWith(Parameterized.class)
public class TestTreeLevelTraversal {
	Node node;
	TreeLevelTraversal treelevelTraversal = new TreeLevelTraversal();
	
	@Before
	public void setUp() throws Exception {
		getData(10);
	}


	@Test
	public final void test() {
		treelevelTraversal.travLevel(node);
	}


	private void getData(int i) {
		
		while(0 < i-- ){
			int val = new Double(Math.random() * 17).intValue();
			
			
			if(node == null){
				node = new Node(val, null, null);
			}else{
				setLeaf(val, node);
			}
			
			
		}
		
	}
	
	private void setLeaf(int val, Node n){
		
		if(val <= n.val){
			if(n.left == null){
				n.left = new Node(val, null, null);
			}else{
				setLeaf(val, n.left);
			}
		}else{
			if(n.right == null){
				n.right = new Node(val, null, null);
			}else{
				setLeaf(val, n.right);
			}
		}
	}
}
