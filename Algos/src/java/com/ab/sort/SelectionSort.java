/**
 * 
 */
package com.ab.sort;

/**
 * 
 * Selection sort: is a sorting algorithm, specifically an in-place comparison
 * sort. It has O(n2) time complexity, making it inefficient on large lists, and
 * generally performs worse than the similar insertion sort. Selection sort is
 * noted for its simplicity, and it has performance advantages over more
 * complicated algorithms in certain situations, particularly where auxiliary
 * memory is limited.
 * 
 * The algorithm divides the input list into two parts: the sublist of items
 * already sorted, which is built up from left to right at the front (left) of
 * the list, and the sublist of items remaining to be sorted that occupy the
 * rest of the list. Initially, the sorted sublist is empty and the unsorted
 * sublist is the entire input list. The algorithm proceeds by finding the
 * smallest (or largest, depending on sorting order) element in the unsorted
 * sublist, exchanging (swapping) it with the leftmost unsorted element (putting
 * it in sorted order), and moving the sublist boundaries one element to the
 * right.
 * 
 * Worst case performance 	О(n2)
 * Best case performance 	О(n2)
 * Average case performance 	О(n2)
 * Worst case space complexity 	О(n) total, O(1) auxiliary
 * 
 * @author XX61691
 *
 */
public class SelectionSort implements Sort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ab.sort.Sort#sort(int[], int)
	 */
	@Override
	public int[] sort(int[] inArr, int order) {
		int temp, smallestIndex;
		for (int i = 0; i < inArr.length; i++) {
			temp = inArr[i];
			smallestIndex = i;
			for (int j = i+1; j < inArr.length; j++) {//select the smallest value from right and swap to the left i position
				if (temp > inArr[j]) {//As this loop proceeds the smallest value moves to left
					temp = inArr[j];
					smallestIndex = j;
				}
			}
			inArr[smallestIndex] = inArr[i];
			inArr[i] = temp;

		}
		return inArr;
	}

}
