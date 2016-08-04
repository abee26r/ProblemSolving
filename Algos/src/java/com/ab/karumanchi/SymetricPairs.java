package com.ab.karumanchi;

import java.util.HashMap;
import java.util.Map;

public class SymetricPairs {
	
	public boolean detect(int [][]a ) {

		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		Integer t = null;
		boolean ret = false;
		for(int i =0; i < a.length; i ++){
			
			if(( t = m.get(a[i][1])) != null && t == a[i][0]){
				System.out.println(a[i][0] + ", " + a[i][1]);
				ret = true;
			}else{
				m.put(a[i][0], a[i][1]);
			}
		}
		
		return ret;
	}
}
