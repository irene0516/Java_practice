package hw;

import java.util.Scanner;

/*
 * Topic:  假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態需要多少位元 (例如: n = 3 則需要 2bits)  (log(n)/log(2)
 * Date: 2016/09/19
 * Author: 105021046 賴沛錞
 */
public class hw01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n");
		int n = scn.nextInt();
		System.out.println(Math.ceil(Math.log(n) / Math.log(2)));

	}

}
