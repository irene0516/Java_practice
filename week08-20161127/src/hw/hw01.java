package hw;

/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int a = scn.nextInt();
		System.out.println(fun(a));

	}

	public static String fun(int a) {
		String str = " ";
		while (a != 0) {
			str = a % 2 + str;
			a = a / 2;

		}
		return str;
	}

}
