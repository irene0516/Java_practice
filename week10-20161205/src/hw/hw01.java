package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("請輸入要幾筆");
		int b = scn.nextInt();
		int data[][] = new int[b][3];
		for (int i = 0; i < b; i++) {
			for (int j = 0; j < 3; j++) {

				data[i][j] = scn.nextInt();

			}
		}
		for (int i = 0; i < b; i++) {
			int a = 0;
		
			for (int j = 0; j < 3; j++) {
				if (data[i][j] < 60) {
					a++;
					// System.out.println(a);
				}

			}
			if (a == 0) {
				System.out.println("P");
			} else if (a == 1) {
				if (data[i][0] + data[i][1] + data[i][2] >= 220) {
					System.out.println("P");
				} else if (data[i][0] + data[i][1] + data[i][2] < 220) {
					System.out.println("M");
				}
			} else if (a == 2) {
				int c = 0;
				for (int l = 0; l < 3; l++) {
					if (data[i][l] >= 80) {
						System.out.println("M");
						c = 0;
						break;
					} else {
						
						c++;

					}
					
				}if (c != 0) {
					System.out.println("F");
				}
			} else if (a == 3) {

				System.out.println("F");
			}

		}
	}

}
