package com.ab.leetcode.med;

public class Palindrome {

	public boolean checkPalindrome(String str) {
		boolean b = false;
		int pivot = str.length() / 2 + str.length() % 2 - 1;
		b = recurPalin(str, pivot - 1, pivot + 1);
		return b;
	}

	/*
	 * assuming case always equal
	 */
	private boolean recurPalin(String str, int left, int rigth) {

		if (rigth == str.length())
			return true;

		if (str.charAt(left) == str.charAt(rigth)) {
			return recurPalin(str, --left, ++rigth);
		} else {
			return false;
		}

	}

	public boolean checkPalindrome(StringBuffer sb) {

		return sb.toString().equalsIgnoreCase(sb.reverse().toString());
	}

}
