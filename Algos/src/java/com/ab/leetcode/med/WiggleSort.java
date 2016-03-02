package com.ab.leetcode.med;

import java.util.Arrays;

public class WiggleSort {

	public void wiggleSort(int[] nums) {
		
		Arrays.sort(nums);
		
		int prev = nums[1], swap;
		
		for (int i = 1; i < nums.length; i++) {
			
			if(i % 2 != 0){
				prev = nums[i];
				
			}
			
			
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println(10 % 0);
	}

}
