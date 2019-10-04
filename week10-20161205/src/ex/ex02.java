package ex;

/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		if (a <= 120) {
			System.out.println(a * 2.1);
			System.out.println(a * 2.1);

		} else if (a > 120 && a <= 330) {
			System.out.println(120 * 2.1 + (a - 120) * 3.02);
			System.out.println(120 * 2.1 + (a - 120) * 2.68);
		} else if (a > 330 && a <= 500) {
			System.out.println(120 * 2.1 + 210 * 3.02 + (a - 330) * 4.39);
			System.out.println(120 * 2.1 + 210 * 2.68 + (a - 330) * 3.61);
		} else if (a > 500 && a <= 700) {
			System.out.println(120 * 2.1 + 210 * 3.02 + 170 * 4.39 + (a - 500) * 4.97);
			System.out.println(120 * 2.1 + 210 * 2.68 + 170 * 3.61 + (a - 500) * 4.01);
		} else if (a > 700) {
			System.out.println(120 * 2.1 + 210 * 3.02 + 170 * 4.39 + 200 * 4.97 + (a - 700) * 5.63);
			System.out.println(120 * 2.1 + 210 * 2.68 + 170 * 3.61 + 200 * 4.01 + (a - 700) * 4.50);
		}
	}

}
