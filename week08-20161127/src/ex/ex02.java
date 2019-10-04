package ex;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		System.out.println("請輸入幾進制轉幾進制");
		int n = scn.nextInt();
		int s = scn.nextInt();
		System.out.println("請輸入數字");
		int a = scn.nextInt();
		if (n == 10) {
			System.out.println(fun(a, s));
		} else if (s == 10) {
			System.out.println(fun2(a, n));
		} else {
			System.out.println(fun(fun2(a, n), s));

		}

	}

	public static String fun(int a, int s) {
		String num = "　";
		while (a != 0) {
			num = a % s + num;
			a = a / s;
		}
		return num;
	}

	public static int fun2(int a, int n) {
		int sum = 0;
		int b = 0;
		while (a != 0) {
			sum = (int) (sum + (a % 10) * Math.pow(n, b));
			b++;
			a = a / 10;

		}
		return sum;

	}

}
