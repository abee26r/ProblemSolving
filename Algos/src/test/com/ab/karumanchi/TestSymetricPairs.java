package com.ab.karumanchi;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;


public class TestSymetricPairs {
	
	private SymetricPairs sp = new SymetricPairs();
	
	@Test
	public void detect() {

		assertTrue(sp.detect(new int[][]{{1,2}, {3,4}, {2,1}}));
		assertTrue(!sp.detect(new int[][]{{1,2}, {3,4}, {2,2}}));
	}
}
