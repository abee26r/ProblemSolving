package com.ab.sort;

/**
 * 
 * BubbleSort: Swap consecutive pairs starting from left. Repeat till all values are sorted/
 * At the end of 1st sort the largest number is in the right position. For all consecutive sorts the right most values
 * are in the final sorted position.
 * 
 * It can be practical if the input is usually in sort order 
 * but may occasionally have some out-of-order elements nearly in position.
 * 
 * Worst case performance 	O(n^2)
 * Best case performance 	O(n)
 * Average case performance 	O(n^2)
 * Worst case space complexity
 * 
 * Adaptive, stable
 * 
 * @author XX61691
 *
 */
public class BubbleSort implements Sort {
	int count;
	@Override
	public int[] sort(int[] inArr, int order) {

		for(int i = 1, k=0; i < inArr.length - k; k++){
			
			for(int j = i; j < inArr.length-k; j++){
				
				if(inArr[j-1] > inArr[j]){
					int temp = inArr[j];
					inArr[j] = inArr[j-1];
					inArr[j-1] = temp;
				}
				count++;
			}
			
		}
		System.out.println("Iterations count: "+ count);
		return inArr;
	}

}
