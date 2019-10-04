package hw;

import java.util.Scanner;

public class hw01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = 0;
		while (a > 0) {
			b++;
			a = a / 10;
		}
		System.out.println("此數為" + b + "位數");

	}

}
