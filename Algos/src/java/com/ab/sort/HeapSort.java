/**
 * 
 */
package com.ab.sort;

/**
 * 
 * Heap sort: When you don't need a stable sort and you care more about worst
 * case performance than average case performance. It's guaranteed to be O(N log
 * N), and uses O(1) auxiliary space, meaning that you won't unexpectedly run
 * out of heap or stack space on very large inputs.
 * 
 * Heap: Represent as Tree or Array.
 * Array:
 * Child:          |Parent:
 * n --->2n + 1    |(n-1)/2 <----n
 * !---->2n + 2    |
 * 
 * @author XX61691
 *
 */
public class HeapSort implements Sort {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ab.sort.Sort#sort(int[], int)
	 */
	@Override
	public int[] sort(int[] inArr, int order) {
		
//		inArr = new int[]{0, 1, 0};
		
		for (int i = inArr.length - 1; i > 0; i--) {

			convert2Heap(inArr, i);
			swap(inArr, i, 0);

		}
		
		
		
		return inArr;
	}
	
	private void convert2Heap(int[] a, int end) {
		int maxV=0;
		
		if(end % 2 == 1){
			traverseParent(a, end--, end);
		}
		for (int i = end; i > 0; i -= 2) {
			maxV = a[i] > a[i - 1] ? i : i - 1;
			traverseParent(a, maxV, end);
		}
		
	}
	
	private void traverseParent(int[] a, int child, int end){
		int parent = (child - 1)/2;
		if(a[parent] < a[child]){
			swap(a, parent, child);
			traverseChild(a, parent, end);
		}
		
	}
	
	private void traverseChild(int[] a, int parent, int end){
		int leftChild = 2 * parent + 1;// left child is 2n+1
		int rightChild = 2 * parent + 2;// Right child is 2n+2
		if(leftChild > end || rightChild > end){
			return;
		}
		if(leftChild == 100 || rightChild == 100)
			System.out.println("wtf");
		int maxChild = a[leftChild] > a[rightChild] ? leftChild : rightChild;
		
		if(a[parent] < a[maxChild]){
			swap(a, parent, maxChild);
			traverseChild(a, maxChild, end);//Recurse thru all the children
		}
		
	}
	
	private void swap(int[] a, int s1, int s2){
		int temp = a[s1];
		a[s1] = a[s2];
		a[s2] = temp;
	}
	
//	for (int i = 0; i < end; i++) {
//		leftChild = a[2 * i + 1];// left child is 2n+1
//		rightChild = a[2 * i + 2];// Right child is 2n+2
//		if(leftChild > rightChild){
//			
//		}
//
//	}
}
