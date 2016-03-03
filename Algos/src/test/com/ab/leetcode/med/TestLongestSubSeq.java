package com.ab.leetcode.med;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestLongestSubSeq {

	private LongestSubSeq longestSubSeq;
	
	private int[]a;
	
	@Before
	public void setup(){
		longestSubSeq = new LongestSubSeq();
	}
	
	@Test
	public final void test() {
		fail("Not yet implemented"); // TODO
	}
	
	@Parameters
	public static Collection getData(){
		return Arrays.asList(new Object[]{1,2,3,4});
		
	}
	
	public TestLongestSubSeq(int[] a) {
		this.a = a;
	}

}
