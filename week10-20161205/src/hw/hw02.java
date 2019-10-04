package hw;

import java.util.Scanner;

public class hw02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int data[] = new int[4];
		int sum = 0;
		for (int i = 0; i < 4; i++) {
			data[i] = sc.nextInt();
			for (int j = 0; j < i; j++) {
				if (data[i] == data[j]) {
					sum++;
				}
			}
		}
		if (sum == 1) {
			int a = 0;
			for (int i = 0; i < 3; i++) {
				if (data[i] == data[i + 1]) {
					System.out.println(2 * data[i]);
				}
			}
		} else if (sum == 2) {
			for (int i = 0; i < 3; i++) {

				for (int j = i; j < 3; j++) {
					if (data[i] < data[j + 1]) {
						int b = data[i];
						data[i] = data[j + 1];
						data[j + 1] = b;
					}
				}

				System.out.println(2 * data[0]);
				break;

			}
		}

		else if (sum == 6) {
			System.out.println("³q±þ");
		} else {

			System.out.println("R");
		}

	}
}
