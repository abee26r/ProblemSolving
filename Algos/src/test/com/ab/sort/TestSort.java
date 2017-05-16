package com.ab.sort;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	private Sort selectionSort;
	private SelectionSort2 s2;
	private BubbleSort2 bs2 = new BubbleSort2();
	private MergeSort2 ms2 = new MergeSort2();
	
	int [] IN_ARR100= new int[]{3,1};
	
	@Before
	public void setUp() throws Exception {
		insertionSort = new InsertionSort();
		s2 = new SelectionSort2();
		bubbleSort = new BubbleSort();
		shellSort = new ShellSort();
		heapSort = new HeapSort();
		quickSort = new QuickSort();
		mergeSort = new MergeSort();
		introSort = new IntroSort();
		selectionSort = new SelectionSort();
	}

	@Test
	public final void testInsertionSort() {
		List list = null;
		ArrayList a = (ArrayList) list;
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, insertionSort.sort(arr, 0)));
		
	}
	
	@Test
	public final void testSelSort2() {
		List list = null;
		ArrayList a = (ArrayList) list;
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, s2.sort(arr)));
		
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
	public final void testBubbleSort2(){
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, bs2.sort(arr)));
		
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
		for(int i =0; i<100;i++){
			int []arr = generateSampledata(250);
			int []sortedArr = Arrays.copyOf(arr, 250);
			Arrays.sort(sortedArr);
			if(!Arrays.equals(sortedArr, heapSort.sort(arr, 0))){
				System.out.println("wtf");
			}
			assertTrue(Arrays.equals(sortedArr, heapSort.sort(arr, 0)));
		}
		
	}
	
	@Test
	public final void testMergeSort(){
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, mergeSort.sort(arr, 0)));
		
	}
	
	@Test
	public final void testMergeSort2(){
		
		int []arr = generateSampledata(100);
		System.out.println(Arrays.toString(arr));
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		int []array = ms2.sort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(array));
		assertTrue(Arrays.equals(sortedArr, array));
		
	}
	
	@Test
	public final void testIntroSort(){
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, introSort.sort(arr, 0)));
		
	}
	
	@Test
	public final void testSelectionSort(){
		
		int []arr = generateSampledata(100);
		int []sortedArr = Arrays.copyOf(arr, 100);
		Arrays.sort(sortedArr);
		assertTrue(Arrays.equals(sortedArr, selectionSort.sort(arr, 0)));
		
	}
	
	
	
	private int[] generateSampledata(int count) {

		int []origArr = new int[count]; 
		for(int i = 0; i<count; i++){
			origArr[i] = (int)Math.floor(Math.random() * 100);
		}
		
		return origArr;
	}

}
