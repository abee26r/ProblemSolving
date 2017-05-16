package com.ab.sort;

public class SelectionSort2 {

	public int [] sort(int []a){
		
		for (int i = 0; i < a.length; i++) {
			int k = i;
			for(int j = i+1; j < a.length; j++){
				if(a[j] < a[k]){
					k = j;
				}
			}
			int t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
		
		return a;
	}
}
