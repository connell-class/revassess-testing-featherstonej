package com.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		int sumPowers = 0;
		char[] digits = String.valueOf(num).toCharArray();
		int len = digits.length;
		for(char c: digits) {
			sumPowers += Math.pow(Double.parseDouble(String.valueOf(c)), len);
		}		
		return num == sumPowers;
	}
}
