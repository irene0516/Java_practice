package hw;

import java.util.Scanner;

public class hw05_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i * (i + 1);
		}
		System.out.println(sum);
	}

}
