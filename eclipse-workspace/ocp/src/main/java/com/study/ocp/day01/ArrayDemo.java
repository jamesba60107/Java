package com.study.ocp.day01;

import java.util.Arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		/*
		int chinese = 100;
		int math = 80;
		int english = 90;
		*/
		int[] scores = {100, 80, 90};
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[0] + scores[1] + scores[2]);
		System.out.println(scores.length); // 資料長度
		// java.util.Arrays 陣列補充包
		System.out.println(Arrays.toString(scores));
		// for-loop         來遍歷(巡訪) scores 陣列內容(Standard loop)
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		// 利用 for-in(each) 來遍歷(巡訪) scores 陣列內容(Enhance loop)
		for(int x : scores) {
			System.out.println(x);
		}
	}
}
