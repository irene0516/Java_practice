package hw;

import java.util.Scanner;

public class hw01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int x = 15 * a + 20 * b + 30 * c;
		if (n > x) {
			System.out.println("50元" + (n - x) / 50 + "個");
			System.out.println("5元" + (n - x) % 50 / 5 + "個");
			System.out.println("1元" + (n - x) % 50 % 5 + "個");
		} else {
			System.out.println("0");
		}
	}

}
