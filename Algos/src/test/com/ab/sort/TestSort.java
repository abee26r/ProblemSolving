package com.ab.sort;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestSort {

	private Sort  insertionSort;
	private Sort bubbleSort;
	private Sort shellSort;
	private Sort heapSort;
	private Sort quickSort;
	private Sort mergeSort;
	private Sort introSort;
	
	int [] IN_ARR100= new int[]{3,1};
	
	@Before
	public void setUp() throws Exception {
		insertionSort = new InsertionSort();
		bubbleSort = new BubbleSort();
		shellSort = new ShellSort();
		heapSort = new HeapSort();
		quickSort = new QuickSort();
		mergeSort = new MergeSort();
		introSort = new IntroSort();
	}

	@Test
	public final void testInsertionSort() {
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, insertionSort.sort(arr, 0)));
		
	}
	
	@Test
	public final void testShellSort() {
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, shellSort.sort(arr, 0)));
		
	}
	
	@Test
	public final void testBubbleSort(){
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, bubbleSort.sort(arr, 0)));
		
	}
	
	@Test
	public final void testQuickSort(){
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, quickSort.sort(arr, 0)));
		
	}
	
	@Test
	public final void testHeapSort(){
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, heapSort.sort(arr, 0)));
		
	}
	
	@Test
	public final void testMergeSort(){
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, mergeSort.sort(arr, 0)));
		
	}
	
	@Test
	public final void testIntroSort(){
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, introSort.sort(arr, 0)));
		
	}
	
	
	private int[] generateSampledata(int count) {

		int []origArr = new int[count]; 
		for(int i = 0; i<count; i++){
			origArr[i] = (int)Math.floor(Math.random() * 100);
		}
		
		return origArr;
	}

}
