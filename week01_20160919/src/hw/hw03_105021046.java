package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
 * Date: 2016/09/19
 * Author: 105021046 賴沛錞
 */
public class hw03_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入六個數");
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		float d = scn.nextFloat();
		float e = scn.nextFloat();
		float f = scn.nextFloat();
		int n = Math.min(Math.min(Math.round(a), Math.round(b)), Math.round(c));
		int m = Math.min(Math.min(Math.round(d), Math.round(e)), Math.round(f));
		System.out.println(Math.min(n, m));

	}

}
