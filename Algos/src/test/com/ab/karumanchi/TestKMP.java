package com.ab.karumanchi;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

public class TestKMP {

	KMP kmp;
	@Before
	public void setUp() throws Exception {
		kmp = new KMP();
	}

	@Test
	public final void testPrefix() throws Exception {
		Class<KMP> c = KMP.class;
		Method mm = c.getDeclaredMethod("prefix", char[].class, Integer.TYPE);
		mm.setAccessible(true);
		
		mm.invoke(new char[]{'a','b','a','b','a','c','a'}, 7);
	}

}
