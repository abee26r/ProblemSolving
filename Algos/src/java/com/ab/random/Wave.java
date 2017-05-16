package com.ab.random;

import java.util.Arrays;

public class Wave {
	
	private static void doProcess(int []a) {
		
		int i = 0;
		while(i < a.length - 1){
			
			//odd
			if(i % 2 == 0 && a[i] > a[i + 1]){
				swap(a, i, i+1);
				i = i-2 >=0 ? --i : 0;
			}else if(i % 2 != 0 && a[i] < a[i + 1]){//even
				swap(a,i, i+1);
				i = i-2 >=0 ? --i : 0;
			}else{
				i++;
			}
			
			
			
		}
		
		System.out.println(Arrays.toString(a));
	}
	
	public static void swap(int []a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {

		doProcess(new int[]{1,2,3,4,1,2,3,4});
	}
}
