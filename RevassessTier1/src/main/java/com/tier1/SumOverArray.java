package com.tier1;

public class SumOverArray {

	public static int IterateAndSum(int[] arr) {
		int answer = 0;
		if(arr == null) {
			return 0;
		}
		for(int i: arr) {
			answer += i;
			System.out.println(i);
		}
		return Math.abs(answer);
	}
}
