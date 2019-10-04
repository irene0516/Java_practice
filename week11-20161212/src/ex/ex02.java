package ex;

/*
 * Date: 2016/12/12
 * Author: 105021046  ¿à¨KëÞ
 */
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J");
		String str = scn.nextLine();
		String s[] = str.split(" ");
		int sum = 0;
		float sum2 = 0;
		for (int i = 0; i < s.length; i++) {
			float f = Float.parseFloat(s[i]);
			if (f == (int) Float.parseFloat(s[i])) {
				sum++;
				sum2 += f;
			}

		}
		double a=(Math.round(sum2 / s.length*1000)*0.001);
		System.out.println("Size:"+sum);
		System.out.printf("Average:%.3f",a);
	


	}
}