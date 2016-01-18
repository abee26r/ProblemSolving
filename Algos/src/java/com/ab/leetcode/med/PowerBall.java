package com.ab.leetcode.med;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PowerBall {

	static Integer []white = new Integer[]{3,7,8,9,10,11,12,13,14,15,16,17,18,19,24,25,28,29,30,31,32,33,34,38,39,42,45,46,47,48,49,50,52,55,57,29,2,54,60,61,65};
	static Integer []red = new Integer[]{11,12,25,9,10,16,18,19,24,17,15,7};
	
	public static void main(String[] args) {
		List<Integer> whiteList = new ArrayList<Integer>(Arrays.asList(white));
		for(int i =0 ;i<7;i++)
			Collections.shuffle(whiteList);
		
		List<Integer> redList = new ArrayList<Integer>(Arrays.asList(red));
		for(int i =0 ;i<7;i++)
			Collections.shuffle(redList);
		
		int i =0, j=0;
		for (; i<red.length; i++) {
			int count=0;
			for (; j<white.length; j++) {
				System.out.print(whiteList.get(j) + "--");
				if(count++ == 4){
					break;
				}			}
			System.out.println(">" + redList.get(i));
		}
	}
	
	private final static void sortGroup(List<Integer> l, int len) {

		int pivot = len/2;
		
		
	}
	private void sort(List<Integer> l, int len, int start) {
		int p = len;
		Integer pe = l.get(p);
		for(int i=start; i < len; i++){
			Integer x = l.get(i);
			if(x > pe){
				
			}
		}
	}
}
