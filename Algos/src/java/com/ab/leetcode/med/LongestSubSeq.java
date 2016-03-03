/**
 * 
 */
package com.ab.leetcode.med;

/**
 * @author abee
 *
 */
public class LongestSubSeq {

	public int compute(int []a){
		
		int []t = new int[a.length];
		
		for(int i =1 ; i < a.length ; i++){
			
			for(int j = 0; j <= i ; j ++){
				
				if(a[j] < a[i] && t[i] < t[j] + 1 ){
					t[i] = t[j] + 1;
				}
				
			}
			
		}
		
		return 0;
		
	}
}
