package hw;
/*
 * Topic: 設計一個程式，讓使用者輸入一個正整數n，判斷並輸出n的多少次方才會大於10000
 * Date: 2016/10/24
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n");
		int n = scn.nextInt();
		int i = 1;
		while (n > 0) {
			if ((int) Math.pow(n, i) > 10000) {
				System.out.println(i);
				break;
			}
			i++;
		}

	}

}
