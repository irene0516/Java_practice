package hw;
/*
 * Topic: ���@ n x n���x�}(1��n��21)�A��J n ��A�եH�{��ø�X���@��}�A��}���c�p�U�A�Ҧp n=5 �ɡG 
 * Date: 2016/10/24
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J");
		int n = scn.nextInt();
		int data[][] = new int[n][n];
		data[0][0] = 1;
		if (n > 0 && n < 21) {
			for (int i = 1; i < n; i++) {
				data[i][0] = data[i - 1][0] + i;

			}
			for (int i = 0; i < n; i++) {
				int b = 2 + i;
				for (int j = 1; j < n - i; j++) {
					data[i][j] = data[i][j - 1] + b;
					b++;
				}

			}
			for (int i = 1; i < n; i++) {
				int c = n;
				for (int j = n - i; j < n; j++) {
					data[i][j] = data[i][j - 1] + c;
					c--;

				}

			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(data[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("�Э��s��J");
		}
	}
}
	