package com.ab.random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomizedCollection {
    Map<Integer, Integer> m = new HashMap<>();
    List<Integer> T = new ArrayList<>();
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
    	boolean b = m.containsKey(val);
        if(b){
            m.put(val, m.get(val) + 1);
        }else{
        	m.put(val, 1);
        }
        T.add(val);
        return !b;
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
    	boolean b = m.containsKey(val);
    	if(b && m.get(val) > 1){
            m.put(val, m.get(val) - 1);
        }else if(b){
        	m.remove(val);
        }
    	return b;
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
    	
    	return T.get((int) (Math.random() * 17 * Integer.MAX_VALUE/T.size()) % T.size());
    }
}
