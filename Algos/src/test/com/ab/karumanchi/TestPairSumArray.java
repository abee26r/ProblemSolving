package com.ab.karumanchi;

import org.junit.Before;
import org.junit.Test;

public class TestPairSumArray {
	PairSumArray pairSumArray; 
	@Before
	public void setUp() throws Exception {
		pairSumArray = new PairSumArray();
	}

	@Test
	public final void test() {
		pairSumArray.printPair(new int[]{1,2,3,4,5,6,7}, 5);
	}

}
