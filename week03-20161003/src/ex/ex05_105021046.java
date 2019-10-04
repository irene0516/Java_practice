package ex;

/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex05_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int a = scn.nextInt();
		if (a % 2 == 0) {
			System.out.println("偶數");
		} else {
			System.out.println("奇數");
		}

	}

}
