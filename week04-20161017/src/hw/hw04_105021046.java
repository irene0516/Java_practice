package hw;

import java.util.Scanner;

public class hw04_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入要哪個\n");
		int a = scn.nextInt();
		switch (a) {
		case 1:
			System.out.println("請輸入n");
			int n = scn.nextInt();
			for (int i = 1; i <= (n + 1) / 2; i++) {
				for (int j = (n + 1) / 2; j >= i; j--) {
					System.out.print("@");
				}
				System.out.println();
			}
			for (int i = 2; i <= (n + 1) / 2; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("@");
				}
				System.out.println();
			}
			break;
		case 2:
			System.out.println("請輸入n");
			int v = scn.nextInt();
			for (int i = 1; i <= (v + 1) / 2; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("@");
					
				}
				System.out.println();
			}
			for (int i = 2; i <= (v + 1) / 2; i++) {
				for (int j = (v + 1) / 2; j >= i; j--) {
					System.out.print("@");
				}
				System.out.println();
			}
			break;
		case 3:
			System.out.println("請輸入n");
			n = scn.nextInt();
			for (int i = 1; i <= (n + 1) / 2; i++) {
				for (int j = (n + 1) / 2; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i * 2 - 1; j++) {
					System.out.print("@");
				}
				for (int j = (n + 1) / 2; j > i; j--) {
					System.out.print(" ");
				}
				System.out.println();

			}
			for (int i = 1; i <= (n + 1) / 2 - 1; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= n - 2 * i; j++) {
					System.out.print("@");
				}
				for (int j = 1; j >= (n + 1) / 2; j++) {
					System.out.print(" ");
				}
				System.out.println();
			}
			break;
		case 4:
			break;
		}

	}

}
