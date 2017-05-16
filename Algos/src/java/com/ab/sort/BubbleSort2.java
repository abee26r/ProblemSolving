package com.ab.sort;

public class BubbleSort2 {

	public int[] sort(int [] a){
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 1; j < a.length - i; j++) {
				if(a[j - 1] > a[j]){
					int t = a[j-1];
					a[j-1] = a[j];
					a[j] = t;
				}
			}
		}
		
		return a;
	}
}
