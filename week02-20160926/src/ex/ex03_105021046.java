package ex;

import java.util.Scanner;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021046 賴沛錞
 */

public class ex03_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt() * 60 + scn.nextInt();
		int m = scn.nextInt() * 60 + scn.nextInt();
		int x = m - n;
		if (x >= 30 && x <= 120) {
			System.out.println(x/30*30 + "元");
		} else if (x > 120 && x < 240) {
			System.out.println(120 + (x-120) / 30 * 40 + "元");
		} else {
			System.out.println(280 + (x-240) / 30 * 60 + "元");

		}

	}
}
