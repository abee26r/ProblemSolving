/**
 * 
 */
package com.ab.sort;

/**
 * Shellsort: It is a generalization of bubble and insertion sort. Based on the
 * understanding that insertion sort performs better if the array is partially
 * sorted.
 * 
 * Steps: Do Insertion sort considering a larger gap. Start with n/2 ending with one.
 * 
 * Worst case performance 	O(n2)
 * Best case performance 	O(n log2 n)[1]
 * Average case performance 	depends on gap sequence
 * Worst case space complexity 	О(n) total, O(1) auxiliary
 * 
 * 
 * @author XX61691
 *
 */
public class ShellSort implements Sort {

	int count = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ab.sort.Sort#sort(int[], int)
	 */
	@Override
	public int[] sort(int[] inArr, int order) {
		int k = inArr.length / 2;
		int j = 0;

		// Consider gap k = n/2 and apply insertion sort
		// Outer loop keeps going till k = 1 is processed and one entire insert
		// sort process runs
		for (int i = k; k >= 1; i += k) {
			// Break condition or decrement i & k
			if (i >= inArr.length) {
				if (k == 1)
					break;
				k = k / 2;
				i = 0;
				continue;
			}

			int temp = inArr[i];
			for (j = i; j > 0 && inArr[j - k] > temp; j -= k) {
				inArr[j] = inArr[j-k];
				count++;
			}
			inArr[j] = temp;

		}
		System.out.println("Iterations count: " + count);
		return inArr;
	}

}
