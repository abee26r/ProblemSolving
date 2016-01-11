package com.ab.search.binary;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestBinarySearch {

	BinarySearch bs;

	@Before
	public void setUp() throws Exception {
		bs = new BinarySearch();
	}

	@Test
	public final void testGetPosition() {
		assertEquals("answer shud be 0", 0, bs.getPositionRecursive(ARRAY_OF_NUMBERS1, 10));
		assertEquals("answer shud be 1", 1, bs.getPositionRecursive(ARRAY_OF_NUMBERS1, 20));
		assertEquals("answer shud be 2", 2, bs.getPositionRecursive(ARRAY_OF_NUMBERS1, 33));
		assertEquals("answer shud be 3", 3, bs.getPositionRecursive(ARRAY_OF_NUMBERS1, 123));
		assertEquals("answer shud be 4", 4, bs.getPositionRecursive(ARRAY_OF_NUMBERS1, 232));
		assertEquals("answer shud be 7", 7, bs.getPositionRecursive(ARRAY_OF_NUMBERS1, 98132984));
		assertEquals("answer shud be 9", 9, bs.getPositionRecursive(ARRAY_OF_NUMBERS1, 999999999));
	}

	int[] ARRAY_OF_NUMBERS1 = new int[] { 10, 20, 33, 123, 232, 342, 9899, 98132984, 978989890, 999999999 };
}
