package com.ab.karumanchi;

import java.util.HashMap;
import java.util.Map;

public class PairSumArray {
	public void printPair(int []a, int s){
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		Integer t;
		for(int i : a){
			m.put(i, i);
		}
		
		for(int i: a){
			if((t = m.get(s - i)) != null && t.intValue() != i){
				System.out.println("[" + t + ", " + i + "]");
			}
		}
		
	}
}
