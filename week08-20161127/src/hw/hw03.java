package hw;

/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入數字");
		int a = scn.nextInt();
		System.out.println(fun(a, 1));

	}

	public static int fun(int a, int b) {
		if (a < Math.pow(2, b)) {
			return b - 1;
		} else {
			b++;
			return fun(a, b);
		}

	}

}
