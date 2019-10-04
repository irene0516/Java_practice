package hw;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入幾位轉幾位");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println("輸入數字");
		int c = scn.nextInt();
		if (a == 10) {
			System.out.println(ten(b, c));
		} else if (b == 10) {
			System.out.println(tenelse(a, c));
		} else {
			System.out.println(ten(b, tenelse(a, c)));
		}

	}

	public static String ten(int b, int c) {
		String str = " ";
		while (c != 0) {
			str = c % b + str;
			c = c / b;
		}
		return str;
	}

	public static int tenelse(int b, int c) {
		int sum = 0;
		int f = 0;
		while (c != 0) {
			sum = (int) (sum + c % 10 * (Math.pow(b, f)));
			f++;
			c = c / 10;
		}
		return sum;
	}

}
