package com.ab.sort;

/**
 * 
 * Insertion Sort: Most Appropriate for small sets because stable and low memory overhead
 * 
 * Consider it as sorting two sets of values one to left and other to right.
 * We keep sorting elements to left by placing one element at a time from right to left in its 
 * correct position.
 * [sorted]\^/[unsorted]
 * [4]\^/[9 8 3 9 1]
 * [4 9]\^/[8 3 9 1]
 * [4 8 9]\^/[3 9 1]
 * [3 4 8 9]\^/[9 1]
 * [3 4 8 9 9]\^/[1]
 * [1 3 4 8 9 9]\^/[]
 * 
 * Adaptive, i.e., efficient for data sets that are already substantially sorted: the time complexity is O(nk) when each element in the input is no more than k places away from its sorted position
 * Stable; i.e., does not change the relative order of elements with equal keys
 * In-place; i.e., only requires a constant amount O(1) of additional memory space
 * Online; i.e., can sort a list as it receives it
 * 
 * Worst case performance 	О(n2) comparisons, swaps
 * Best case performance 	O(n) comparisons, O(1) swaps
 * Average case performance 	О(n2) comparisons, swaps
 * Worst case space complexity 	О(n) total, O(1) auxiliary
 * @author XX61691
 *
 */
public class InsertionSort implements Sort {

	@Override
	public int[] sort(int[] inArr, int order) {

		for (int i = 1; i < inArr.length; i++) {
			int temp = inArr[i];
			for (int j = i; j > 0; j--) {
				if (inArr[j - 1] > inArr[j]) {
					inArr[j] = inArr[j - 1];
				} else {
					inArr[j] = temp;
				}
			}

		}
		return inArr;
	}

	@SuppressWarnings("unused")
	private int[] optimizedSort(int[] num) {
		int j; // the number of items sorted so far
		int key; // the item to be inserted
		int i;

		for (j = 1; j < num.length; j++) // Start with 1 (not 0)
		{
			key = num[j];
			for (i = j - 1; (i >= 0) && (num[i] < key); i--) // Smaller values
																// are moving up
			{
				num[i + 1] = num[i];
			}
			num[i + 1] = key; // Put the key in its proper location
		}
		return num;
	}

}
