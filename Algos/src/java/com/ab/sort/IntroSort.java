/**
 * 
 */
package com.ab.sort;

/**
 * 
 * Introsort: This is a quick sort that switches to a heap sort after a certain
 * recursion depth to get around quick sort's O(N^2) worst case. It's almost
 * always better than a plain old quick sort, since you get the average case of
 * a quick sort, with guaranteed O(N log N) performance. Probably the only
 * reason to use a heap sort instead of this is in severely memory constrained
 * systems where O(log N) stack space is practically significant.
 * 
 * @author XX61691
 *
 */
public class IntroSort implements Sort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ab.sort.Sort#sort(int[], int)
	 */
	@Override
	public int[] sort(int[] inArr, int order) {
		// TODO Auto-generated method stub
		return null;
	}

}
