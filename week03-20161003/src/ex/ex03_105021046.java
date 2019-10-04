package ex;

/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex03_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		char n = scn.next().charAt(0);
		if (n >= 65 && n <= 90) {
			System.out.println((char) (n + 32));
		} else if (n >= 97 && n <= 122) {
			System.out.println((char) (n - 32));
		}else{
			System.out.println("這不是英文字母");
		}

	}

}
