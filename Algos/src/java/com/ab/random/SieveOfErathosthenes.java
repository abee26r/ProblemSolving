package com.ab.random;

public class SieveOfErathosthenes {

	public static void main(String[] args) {
		printPrime(500);
	}
	
	public static void printPrime(int n){
		
		
		int []a = new int[n];
		fillSieve(a, 2);
		for (int i = 1; i < a.length; i++) {
			if(a[i] == 0){
				System.out.println(i);
			}
		}
		
	}
	
	
	private static void fillSieve(int []a, int p){
		
		
		
		for(int i= p+p; i < a.length; i +=p){
			a[i] = 1;
		}
		
		if(++p < a.length){
			while(a[p] == 1){
				p++;
			}
			fillSieve(a, p);
		}
		
	}
}
