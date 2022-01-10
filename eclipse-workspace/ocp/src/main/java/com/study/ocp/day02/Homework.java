package com.study.ocp.day02;

/*
調查五位學生之身高及體重如下，試比較其分散程度。
身高：172、168、164、170、176(公分)
體重：62、57、58、64、64(公斤)
 */
public class Homework {

	public static void main(String[] args) {
		double[] higth = {172, 168, 164, 170, 176};
		double[] weigth = {62, 57, 58, 64, 64};
		double higth_cv = MathUtils.getCV(higth);
		double weigth_cv = MathUtils.getCV(weigth);
		System.out.printf("身高變異係數為:%.3f\n", higth_cv);
		System.out.printf("體重變異係數為:%.3f\n", weigth_cv);
		
	}

}

