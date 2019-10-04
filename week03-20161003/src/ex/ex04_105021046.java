package ex;

/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex04_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int a = scn.nextInt();
		int b = 0;
		String str = Integer.toString(a);
		while (a > 0) {
			b = b + a % 10;
			a = a / 10;
		}
		System.out.println(b);
		System.out.print("(");
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			if (i != str.length() - 1) {
				System.out.print("+");
			}

		}
		System.out.print(")");

	}

}
