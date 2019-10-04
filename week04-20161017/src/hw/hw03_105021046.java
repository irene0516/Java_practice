package hw;

import java.util.Scanner;

public class hw03_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		char s = 'y';
		while (s != 'n' || s != 'N') {
			while (n != 999) {
				if (n == 0) {
					a++;
					n = scn.nextInt();
				} else if (n > 0) {
					b++;
					n = scn.nextInt();
				} else {
					c++;
					n = scn.nextInt();
				}
			}
			if (n == 999) {
				System.out.println("0有" + a + "個");
				System.out.println("正數有" + b + "個");
				System.out.println("負數有" + c + "個");
				s = scn.next().charAt(0);
			}
			if (s == 'n' || s == 'N') {
				System.out.println("謝謝使用");
				break;
			}
		}

	}

}
