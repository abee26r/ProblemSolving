package com.ab.random;

import java.util.Iterator;

public class Iter implements Iterator<Integer> {

	private int[] i = new int[]{1,2,3,4,5,6,7};
	private int index = 0;
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (i.length > index);
	}

	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return i[index++];
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Iter in = new Iter();
		Iter out = new Iter();
		out.i = new int[5];
		int count=0, k =3, a=0;
		while(count < k){
			out.i[0] += in.next();
			count++;
		}
		count = 1;
		while(in.hasNext()){
				
				out.i[count] = out.i[count - 1] + in.next();
				count ++;
			
		}
		in = new Iter(); count = 1;
		
		while(count < out.i.length){
			a +=in.next();
			out.i[count] -= a;
			count++;
		}
		
		System.out.println();
	}
	
}
