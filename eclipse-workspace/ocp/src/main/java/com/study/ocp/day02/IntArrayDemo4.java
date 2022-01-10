package com.study.ocp.day02;
/*
某公司有 18 位員工，
其中 10 位在去年投資股票，一年的獲利率如下(單位：%)：
7.6 3.9 15.6 28.3 1.2 10.8 35.3 45.6 10.2 0.5
另外 8 位員工投資買公債一年內獲利率如下(單位：%)
6.8 7.2 6.8 7.5 6.9 7.9 7.9 7.1 7.2
試分別求此公司的員工投資股票與公債的獲利率變異係數。
ps:欲比較兩者不同單位的分散程度可以使用變異係數
變異係數＝標準差/ 平均
*/
public class IntArrayDemo4 {

	public static void main(String[] args) {
		double[] stocks = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
		double[] bonds = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
		double stocks_cv = MathUtils.getCV(stocks);
		double bonds_cv = MathUtils.getCV(bonds);
		System.out.printf("股票變異係數: %.1f\n", stocks_cv);
		System.out.printf("公債變異係數: %.1f\n", bonds_cv);

	}

}
