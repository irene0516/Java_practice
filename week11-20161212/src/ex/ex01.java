package ex;

/*
 * Date: 2016/12/12
 * Author: 105021046  賴沛錞
 */
import java.util.Scanner;

public class ex01 {
	public static void main(
			String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入有幾筆");
		int n = scn.nextInt();
		int data[][] = new int[n][3];
		String str[] = new String[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = scn.nextInt();

			}
			int a[] = new int[data[i][2]];
			for (int j = 0; j < data[i][2]; j++) {
				a[j] = scn.nextInt();
				for (int k = 0; k < j; k++) {
					if (a[j] < a[k]) {
						int v = a[j];
						a[j] = a[k];
						a[k] = v;
					}
				}

			}

			int sum = 0;
			for (int j = 0; j < data[i][1]; j++) {
				sum = sum + a[j];
			}
			if (sum < data[i][0]) {
				str[i] = Integer.toString(sum);
			} else {

				str[i] = "Impossible";
			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println(str[i]);
		}

	}
}