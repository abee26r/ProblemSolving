package com.ab.leetcode.med;

import java.util.Arrays;

public class WiggleSort {

	public void wiggleSort(int[] nums) {
<<<<<<< HEAD
		
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
=======

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; i < nums.length; j++) {
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		
		for (int i = 1, j=nums.length - 1; i < j; i+=2,j--) {
			int temp = nums[j - 1];
			nums[j - 1] = nums[j];
			nums[j] = temp;
			
			
		}

>>>>>>> wiggle sort temp
	}

}
