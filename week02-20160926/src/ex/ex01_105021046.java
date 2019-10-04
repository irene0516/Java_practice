package ex;
import java.util.Scanner;
/*
 * Topic: 電話公司的計費方式是 600分鐘以下每分鐘0.5元；
 * 	600~1200分鐘電話費以9折計算；1200分鐘以上電話費以79折計算，
 *  讓使用者輸入單月使用分時間(分鐘)，算出電話費(元)
 * Date: 2016/09/26
 * Author: 105021046 賴沛錞
 */

public class ex01_105021046 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float m = (float) 0.5;
		System.out.println("請輸入");
		int n = scn.nextInt();
		if (n <= 600) {
			System.out.println(n * m + "元");
		} else if (n > 600 && n < 1200) {
			System.out.println(n * m * 0.9 + "元");
		} else {
			System.out.println(n * m * 0.79 + "元");
		}

	}


}
