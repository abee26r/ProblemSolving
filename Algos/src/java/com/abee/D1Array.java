package com.abee;

public class D1Array {

	public static void doStuff(int []a){
		
		for (int i = 0; i < a.length; i++) {
			swp(a, i);
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] != i){
				System.out.println(i);
				break;
			}
		}
	}
	
	public static void swp(int []a, int i){
		
		while(a[i] < a.length && a[i] != i){
			int t = a[a[i]];
			a[a[i]] = a[i];
			a[i] = t;
		}
	}
	
	public static void main(String[] args) {
		doStuff(new int []{0,1,2,3,4,5,6,7,8,9,20,11,12,13,14,15,16,17,18,19,21,22});
	}
}
