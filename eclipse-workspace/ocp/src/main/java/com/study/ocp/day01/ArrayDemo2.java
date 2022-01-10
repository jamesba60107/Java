package com.study.ocp.day01;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int[] poker = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		// 依序印出
		for(int i=0;i<poker.length;i++) {
			System.out.printf("%d ", poker[i]);
		}
		System.out.println();
		// 反序印出
		for(int i=poker.length-1;i>=0;i--) {
			System.out.printf("%d ", poker[i]);
		}
		
	}

}
