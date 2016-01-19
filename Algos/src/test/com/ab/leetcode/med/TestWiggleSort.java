package com.ab.leetcode.med;


import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class TestWiggleSort {

	WiggleSort wiggleSort = new WiggleSort();
	
	@Test
	public final void testWiggleSort() {
		int []a = new int[]{1,1,3};
		wiggleSort.wiggleSort(a);
		assertTrue(Arrays.equals(a, new int[]{1,3,1}));
		
		a = new int[]{1,1,3,2};
		wiggleSort.wiggleSort(a);
		assertTrue(Arrays.equals(a, new int[]{1,2,1,3}));
		
		a = new int[]{1,3,2,2,3,1};
		wiggleSort.wiggleSort(a);
		assertTrue(Arrays.equals(a, new int[]{1,2,1,3}));
		
		
		
	}

}
