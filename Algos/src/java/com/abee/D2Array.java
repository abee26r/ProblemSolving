package com.abee;

public class D2Array {

	public static int maxsum(int [][]a, int k){
		
		double sq = Math.sqrt(k);
		if(a.length == sq){
			return a[(int)sq-1][(int)sq-1];
		}
		
		int temp = (int) Math.ceil(Math.sqrt(k));
		k -= Math.pow((--temp), 2);
		int n = a[temp][temp];
		int i1 = temp,  i2 = temp - 1, j1 = temp - 1, j2 = temp;
		
		while(k > 0 && j1 >= 0 && i2 >= 0 ){
			
			if(a[i1][j1] < a[i2][j2]){
				n = a[i1][j1];
				j1--;
			}else{
				n = a[i2][j2];
				i2--;	
			}
			--k;
		}
		int p = 0;
		
		while(k > 0 && j1 >= p){
			n = a[i1][p];
			k--;
			p++;
		}
		
		while(k > 0 && i2 >= p){
			n = a[p][j2];
			k--;
			p++;
		}
		
		
		return n;
	}
	
	
	public static void main(String[] args) {
		int [][]a = new int[4][4];
		
		a[0] = new int[]{10, 20, 30, 40};
		a[1] = new int[]{21, 25, 35, 45};
		a[2] = new int[]{24, 29, 37, 48};
		a[3] = new int[]{32, 33, 39, 50};
		
		System.out.println(maxsum(a, 1));
	}
}
