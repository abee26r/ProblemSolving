package com.ab.sort;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class TestSort {

	Sort  insertionSort;
	Sort bubbleSort;
	Sort shellSort;
	
	@Before
	public void setUp() throws Exception {
		insertionSort = new InsertionSort();
		bubbleSort = new BubbleSort();
		shellSort = new ShellSort();
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
	
	
	private int[] generateSampledata(int count) {

		int []origArr = new int[count]; 
		for(int i = 0; i<count; i++){
			origArr[i] = (int)Math.floor(Math.random() * 1000000);
		}
		
		return origArr;
	}

}
