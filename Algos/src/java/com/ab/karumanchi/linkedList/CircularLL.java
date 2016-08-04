package com.ab.karumanchi.linkedList;

public class CircularLL {

	public boolean isCircul(Node n) {
		int count = 0;
		Node fast = n;
		Node slow = n;
		
		while(fast != null && fast.next != null){
			count++;
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow){
				System.out.println(count + "val=" +fast.v);
				return true;
			}
			
		}
		System.out.println(count);
		return false;
	}
	
	public int getCirclStart(Node n){
		int count = 0;
		Node fast = n;
		Node slow = n;
		
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow){
				slow = n;
				break;
			}
			
		}
		
		while(fast != slow){
			fast = fast.next;
			slow = slow.next;
		}
		
		System.out.println(fast.v);
		return fast.v;
	}
}
