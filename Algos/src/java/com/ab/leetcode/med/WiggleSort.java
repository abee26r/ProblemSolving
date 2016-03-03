package com.ab.leetcode.med;

import java.util.Arrays;

public class WiggleSort {

	public void wiggleSort(int[] nums) {

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

	}

}
