package com.ab.leetcode.med;

/**
 * Find median of array in linear O(n) time O(1) space
 * 
 * @author abee
 *
 */
public class Median {
	/**
	 * @param a
	 * @return
	 */
	public int findMedian(int[] a) {
//		printa(a);
		int prevLeft = Integer.MAX_VALUE;
		int previ = 0;
		for(int i=Integer.MAX_VALUE; i >0; i /= 2){ //iterate start frm max to 0 decrementing half each time
			int s = a.length - 1;
			for(int j = 0; j<=s; j++){//iterate thru arr each time moving larger to right
				if(a[j] > i){
					swap(a, s, j);
					--s;//last element is def larger so decremt loop by 1
					--j;//since swapped we have to reevaluae the new number at j
				}
			}
			//initially all numbers to left, when left grows smaller than half we are near median
			if((prevLeft > a.length/2) && s < a.length/2){
				//identify if prev left was closer to len mid or the new left
				if(- a.length/2 + prevLeft > a.length/2 - s){
					System.out.println("Length = " + a.length + "--Median = " + i + " -- Left = " + s);//correct 
					System.out.println("##Length = " + a.length + "--Median = " + previ + " -- Left = " + prevLeft);//prev
				}else{
					System.out.println("Length = " + a.length + "--Median = " + previ + " -- Left = " + prevLeft);//correct
					System.out.println("**Length = " + a.length + "--Median = " + i + " -- Left = " + s);//prev
				}
				
				return i;
			}
			prevLeft = s;
			previ = i;
		}
		return -1;
	}
	
	public void swap(int []a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private void printa(int []a) {
		// TODO Auto-generated method stub
		for (int i : a) {
			System.out.print(i + ",");
		}
		System.out.println("");
		System.out.println("abcd");
	}
}
