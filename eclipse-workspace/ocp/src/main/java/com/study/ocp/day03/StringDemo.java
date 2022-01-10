package com.study.ocp.day03;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		String words = "she sell sea shell on the sea shore";
		System.out.println(words);
		// word的長度
		System.out.printf("長度: %d\n", words.length());
		// 有沒有 on 這個字
		System.out.printf("On 的位置在: %d\n", words.indexOf("on"));
		// 有沒有 off 這個字
		System.out.printf("On 的位置在: %d\n", words.indexOf("off"));
		// 有幾個字 ？ 提示: split()
		String[] wordarray = words.split(" ");
		System.out.println(Arrays.toString(wordarray));
		System.out.println(wordarray.length);
	}
}