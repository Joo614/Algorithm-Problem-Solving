package com.codestates.coplit; 

public class Solution { 
	public int LSCS(int[] arr) {
		int subArrSum = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			subArrSum = subArrSum + arr[i];
			if(subArrSum > max) max = subArrSum;

			if (subArrSum < 0) {
				subArrSum = 0;
			}
		}
		return max;
	}
}
