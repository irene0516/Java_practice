package hw;

import java.util.Scanner;

public class hw02_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ğ¿é¤Jn©Mm");
		int n = scn.nextInt();
		int m = scn.nextInt();
		int sum = 1;
		for (int i = n; i >= (n - m) + 1; i--) {
			sum = sum * i;
		}
		for (int j = 1; j <= m; j++) {
			sum = sum / j;
		}
		System.out.println(sum);

	}

}
