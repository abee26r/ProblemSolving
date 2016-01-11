/**
 * 
 */
package com.ab.sort;

/**
 * 
 * Merge sort: When you need a stable, O(N log N) sort, this is about your only
 * option. The only downsides to it are that it uses O(N) auxiliary space and
 * has a slightly larger constant than a quick sort. There are some in-place
 * merge sorts, but AFAIK they are all either not stable or worse than O(N log
 * N). Even the O(N log N) in place sorts have so much larger a constant than
 * the plain old merge sort that they're more theoretical curiosities than
 * useful algorithms.
 * 
 * @author XX61691
 *
 */
public class MergeSort implements Sort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ab.sort.Sort#sort(int[], int)
	 */
	@Override
	public int[] sort(int[] inArr, int order) {
		// TODO Auto-generated method stub
		int []x = recursiveSort(inArr, 0, inArr.length-1);
		return x;
	}
	
	private int[] recursiveSort(int []inArr, int lo, int high){

		if(high == lo)
			return new int[]{inArr[lo]};
		
		
		//split to the smallest element = 1
		
		int a[] = recursiveSort(inArr, lo, (lo + high)/2);
		int b[] = recursiveSort(inArr, (lo + high)/2 + 1, high);
		
		int []x = new int[a.length + b.length];
		
		int indexA = 0, indexB = 0;
		
		//sort and merge smaller lists
		for(int i=0; i<x.length; i++){
			if(indexA >= a.length){
				x[i] = b[indexB++];
				continue;
			}else if(indexB >= b.length){
				x[i] = a[indexA++];
				continue;
			}
			
			if(a[indexA]<b[indexB]){
				x[i] = a[indexA++];
			}else{
				x[i] = b[indexB++];
			}
			
			
		}
		
		return x;
	}

}
