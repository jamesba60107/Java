package com.study.ocp.day02;

public class IntArrayDemo3 {
	public static void main(String[] args) {
		int[] nums = new int[] {90, 40, 100, 55, 60};
		double sd = MathUtils.getSD(nums);
		System.out.printf("標準差: %.1f\n", sd);
	}
}
