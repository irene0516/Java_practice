package hw;

import java.util.Scanner;

public class hw03_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if (((n % 4) == 0 && (n % 100) != 0) || n % 400 == 0) {
			System.out.println("閏年");
		} else {
			System.out.println("平年");
		}
	}

}
