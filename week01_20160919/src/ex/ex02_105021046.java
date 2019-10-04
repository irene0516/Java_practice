package ex;

import java.util.Scanner;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021046 賴沛錞
 */

public class ex02_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入體重");
		float a = scn.nextFloat();
		System.out.println(a / 0.45359 + "磅");

	}

}
