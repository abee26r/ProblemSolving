/**
 * 
 */
package com.ab.leetcode.med;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author abee
 *
 */
@RunWith(Parameterized.class)
public class TestPalindrome {

	private String s;
	private boolean res;
	private Palindrome palindrome;
	
	
	@Test
	public final void test() {
		assertEquals( palindrome.checkPalindrome(s), res);
	}
	
	public TestPalindrome(String s, String res) {
		this.s = s;
		this.res = Boolean.parseBoolean(res);
	}
	
	@Parameters
	public static Collection giveData(){
		
		return Arrays.asList(new String[][]{{"lyryl","true"},{"doodo", "false"}});
	}
	
	@Before
	public void setup(){
		palindrome = new Palindrome();
	}

}
