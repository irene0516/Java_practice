package ex;

/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex06_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int x = scn.nextInt();
		if (x < -1) {
			System.out.println("y=" + 3 * (int) Math.pow(x, 2));
		} else if (x >= -1 && x <= 1) {
			System.out.println("y=" + ((Math.pow(x, 3)) + (3 * x - 3)));
		} else if (x > 1) {
			System.out.println("y=" + ((int) Math.pow(2, x) + 3));
		}

	}

}
