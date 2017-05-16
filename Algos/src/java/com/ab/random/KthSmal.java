package com.ab.random;

public class KthSmal {
	
	public static int deduce(int []a, int k, int i, int j){
		
		
		int x = i, y =j;
		int p = a[i+(j-i)/2];

		while(i <= j){
			while(a[i] < p){
				i++;
			}
			while(a[j] > p){
				j--;
			}
			if(i <= j ){
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i++;
				j--;
			}	
			
			
		}
		
		if(i == k){
			return a[i];
		}else if(i < y && i < k){
			return deduce(a, k - i, i, y);
		}else if(i < y){
			return deduce(a, k, x, i);
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		int []a = new int[]{1,2,3,4,5,6,7,8,9};
		System.out.println(deduce(a, 7, 0 ,a.length - 1));
	}
}
