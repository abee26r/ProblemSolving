/**
 * 
 */
package com.ab.sort;

/**
 * 
 * Quick sort: When you don't need a stable sort and average case performance
 * matters more than worst case performance. A quick sort is O(N log N) on
 * average, O(N^2) in the worst case. A good implementation uses O(log N)
 * auxiliary storage in the form of stack space for recursion.
 * 
 * 
 * 1. Pick an element, called a pivot, from the array. Picking last number as pivot is easier to implement :)
 * 2. Partitioning: reorder the array so that all elements with values less than the pivot 
 * come before the pivot, while all elements with values greater than the pivot come 
 * after it (equal values can go either way). After this partitioning, the pivot is 
 * in its final position. This is called the partition operation.
 * 3. Recursively apply the above steps to the sub-array of elements with smaller values 
 * and separately to the sub-array of elements with greater values.
 * 
 * Worst case performance 	O(n2)
 * Best case performance 	O(n log n) (simple partition)
 * or O(n) (three-way partition and equal keys)
 * Average case performance 	O(n log n)
 * Worst case space complexity 	O(n) auxiliary (naive)
 * O(log n) auxiliary 
 * 
 * @author XX61691
 *
 */
public class QuickSort implements Sort {
	int count;
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ab.sort.Sort#sort(int[], int)
	 */
	@Override
	public int[] sort(int[] inArr, int order) {
		recursiveSort(inArr, 0, inArr.length - 1);
		return inArr;
		
	}
	
	private void recursiveSort(int []inArr, int lo, int high){
		
		int pivot = high;
		
		for (int i=lo; i<pivot; i++){//iterate thru the set
			if(inArr[i] > inArr[pivot]){//if value at i > p then swap elements to left and place i^th element at pivot+1
				int temp = inArr[i];
				int j;
				for (j = i; j < pivot; j++) {
					inArr[j]=inArr[j+1];
				}
				inArr[pivot]=temp;
				pivot--;//decrement pivot to reflect its new position
				i--;//decrement i since i+1 element is now at i;
			}
		}
		System.out.println(lo + " // " + pivot+ " // " + high);
		if(pivot - lo > 1)
			recursiveSort(inArr, lo, pivot-1);
		if(high - pivot > 1)
			recursiveSort(inArr, pivot+1, high);
		
	}

}
