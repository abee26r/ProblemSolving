package com.ab.karumanchi.linkedList;

import org.junit.Before;
import org.junit.Test;

public class TestCircularLL {

	CircularLL cll;
	
	
	@Before
	public void doSetup(){
		cll = new CircularLL();
		
	}
	@Test
	public void testIsCircul(){
		cll.isCircul(getCirNode());
	}
	
	@Test
	public void testgetCirclStart(){
		cll.getCirclStart(getCirNode());
	}
	
	private Node getCirNode() {
		Node n = new Node(15);
		Node tt = n;
		Node c = null;
		for(int i =0; i <250; i++){
			Node temp = new Node(i);
			temp.next = n;
			n = temp;
			if(i == 10){
				c = n;
			}
		}
		tt.next = c;
		return n;
	}
}
