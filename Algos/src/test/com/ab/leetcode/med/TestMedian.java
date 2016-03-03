/**
 * 
 */
package com.ab.leetcode.med;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.apache.commons.math3.random.RandomDataGenerator;
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
public class TestMedian {

	
	private int[]a;
	private boolean res;
	private Median median;
	@Before
	public void setup(){
		median = new Median();
	}
	
	
	@Test
	public final void test() {
//		System.out.println(res);
		median.findMedian(a);
	}
	
	@Parameters
	public static List<Object[]> getData(){
		RandomDataGenerator dataGenerator = new RandomDataGenerator();

		List<Object[]> l = new ArrayList<>();
		
		for (int j =0; j < 500; j++){
			int sampleSize = dataGenerator.nextInt(0, 100000);
			
			int []a = new int[sampleSize];
			for(int i =0; i < sampleSize;i++){
				a[i] = dataGenerator.nextInt(0, Integer.MAX_VALUE);
			}
			l.add(new Object[]{a});
		}
		
		
		return l;
	}
	
	public TestMedian(int []a) {
		this.a = a;
//		this.res = res;
	}

}
