package com.study.ocp.day02;

import java.util.Arrays;

public class IntArrayDemo {

	public static void main(String[] args) {
		int[] nums = new int[5];
		System.out.println(nums[0]);
		System.out.println(Arrays.toString(nums)); //查看 nums 陣列所有內容
		int lens = nums.length;// 陣列長度(陣列可以存放的資料個數)
		System.out.printf("陣列長度: %d\n", lens);
		System.out.printf("最小維度: %d\n", 0);
		System.out.printf("最大維度: %d\n", lens-1);
		
		//指派(=)資料給陣列 
		nums[3] = 90;
		System.out.println(nums[3]);
		System.out.println(Arrays.toString(nums));
		
		//利用 for-loop 將資料印出
		for(int i=0;i<lens;i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		
	}

}
