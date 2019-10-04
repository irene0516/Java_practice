package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入有幾筆");
		int n = scn.nextInt();
		int data[][] = new int[n][2];
		int sum = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				data[i][j] = scn.nextInt();
				
			}
		}
		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) {
				if (data[i][1] == data[k][0]) {
					sum--;
				}
			}
		}
		System.out.println(sum);

	}

}
