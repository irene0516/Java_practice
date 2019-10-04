package ex;

import java.util.Scanner;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a，程式 計算 a 平方根並輸出 (請使用 Math.sqrt(a) 工具)
 * Date: 2016/09/19
 * Author: 105021046 賴沛錞
 */

public class ex04_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入a");
		float a = scn.nextFloat();
		System.out.println(Math.sqrt(a));
	}

}
