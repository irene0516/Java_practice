package hw;

import java.util.Scanner;
import java.util.Random;
/*
 * Topic: 請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
 * Date: 2016/09/19
 * Author: 105021046 賴沛錞
 */
public class hw02_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println("請輸入n");
		int n = scn.nextInt();
		for (int i = 0; i < 6; i++) {
			int a = rnd.nextInt(n) + 1;
			System.out.println(a);
		}
	}

}
