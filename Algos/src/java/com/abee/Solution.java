package com.abee;

public class Solution {
	public Solution() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Solution();
	}

	public boolean repeatedSubstringPattern(String str) {
		char start = str.charAt(0);
		String subStr = null;
		for (int i = 1; i < str.length(); i++) {
			if(start == str.charAt(i)){
				if(str.startsWith(str.substring(0, i), i)){
					subStr = str.substring(0, i);
				}
			}
		}
		System.out.println(subStr);
		return true;
	}

}
