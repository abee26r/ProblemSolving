package com.ab.sort;

public class MergeSort2 {

	public int [] sort(int [] a, int l, int r){
		
		if(l >= r){
			return a;
		}
		
		int m = l + (r - l) / 2;
		
//		System.out.println("l = " + l + "m = " + m + "r = " + r);
		sort(a, l, m);
		sort(a, m + 1, r);
		
		merge(a, l, m, r);
		
		
		
		return a;
	}
	
	
	
	
	private int[] merge( int[] a, int l, int m, int r) {
	
		int [] t1 = new int [m - l + 1];
		int [] t2 = new int [r - m];
		
		for (int i = 0; i < t1.length; i++) {
			t1[i] = a[l + i];
		}
		for (int i = 0; i < t2.length; i++) {
			t2[i] = a[m + 1 + i];
		}
		int x = 0, y = 0;
		
		while(x < t1.length && y < t2.length){
			if(t1[x] < t2[y]){
				a[l] = t1[x];
				x++;
			}else{
				a[l] = t2[y];
				y++;
			}
			l++;
		}
		
		while(x < t1.length){
			a[l] = t1[x];
			l++;
			x++;
		}
		
		while(y < t2.length){
			a[l] = t2[y];
			l++;
			y++;
		}	
		
		return a;
	}
}
