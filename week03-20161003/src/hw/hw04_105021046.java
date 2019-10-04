package hw;

import java.util.Scanner;

public class hw04_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 1;
		while (n > 0) {
			sum = sum * n;
			n--;
		}
		System.out.println(sum);

	}

}
