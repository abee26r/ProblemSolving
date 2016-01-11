/**
 * 
 */
package com.ab.search.binary;


/**
 * @author XX61691
 *
 */
public class BinarySearch {

	public int getPositionRecursive(int[] input, int qNum) {
		int len = input.length;
		if (len == 0)
			return -1;
		
		return getPositionRecursive(input, qNum, 0, len - 1);
	}

	private int getPositionRecursive(int[] input, int qNum, int left, int right) {

		int mid = (left + right) / 2;
		
		System.out.println(left + "--" + mid + "--" + right);
		if(input[mid] == qNum)
			return mid;
		else if(qNum > input[mid])
			return getPositionRecursive(input, qNum, mid + 1, right);
		else
			return getPositionRecursive(input, qNum, left, mid-1);
		
	}

}
