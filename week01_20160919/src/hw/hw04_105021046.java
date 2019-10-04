package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個程式讓使用者輸入 a 與 b, 程式輸出 a 開 b 次方後的結果，例如 9.0 開 3次方 結果為 2.080083823051904
 * Date: 2016/09/19
 * Author: 105021046 賴沛錞
 */
public class hw04_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入a和b");
		float a = scn.nextFloat();
		float b = scn.nextFloat();

		System.out.println(Math.pow(a, (1 / b)));

	}

}
