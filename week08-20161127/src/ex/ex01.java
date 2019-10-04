package ex;

/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int a = scn.nextInt();
		fun(a);

	}

	public static void fun(int a) {
		String number = " ";
		while (a != 0) {
			number = a % 2 + number;
			a = a / 2;

		}
		System.out.println(number);

	}

}
