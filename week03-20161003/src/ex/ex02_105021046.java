package ex;

/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex02_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		char a = scn.next().charAt(0);
		if (a >= 65 && a <= 90) {
			System.out.println("大寫");
		} else if (a >= 97 && a <= 122) {
			System.out.println("小寫");
		}else {
			System.out.println("其他字元");
		}

	}

}
