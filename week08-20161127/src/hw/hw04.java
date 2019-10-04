package hw;

/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示如圖
 * Date: 2016/11/21
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int a = scn.nextInt();
		tra s = new tra();
		s.num(a);
		
	}
}

class tra {
	public static void num(int a) {
		String str[][] = { { "*****", "*   *", "*   *", "*   *", "*****" },
				{ "    *", "    *", "    *", "    *", "    *", }, { "*****", "    *", "*****", "*    ", "*****", },
				{ "*****", "    *", "*****", "    *", "*****" }, { "*   *", "*   *", "*****", "    *", "    *" },
				{ "*****", "*    ", "*****", "    *", "*****" }, { "*****", "*    ", "*****", "*   *", "*****" },
				{ "*****", "    *", "    *", "    *", "    *" }, { "*****", "*   *", "*****", "*   *", "*****" },
				{ "*****", "*   *", "*****", "    *", "    *" }, };

		for (int j = 0; j < 5; j++) {
			
			System.out.print(str[a / 1000 % 10][j] + "\t");
			System.out.print(str[a / 100 % 10][j] + "\t");
			System.out.print(str[a / 10 % 10][j] + "\t");
			System.out.println(str[a % 10][j] + "\t");

		}
	}
}
