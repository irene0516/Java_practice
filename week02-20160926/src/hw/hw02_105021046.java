package hw;

import java.util.Scanner;

public class hw02_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入性別(男:1,女:2)身高");
		int a = scn.nextInt();
		int b = scn.nextInt();
		if (a == 1) {
			System.out.println("標準體重" + (b - 80) * 0.7);

		} else if (a == 2) {
			System.out.println("標準體重" + (b - 70) * 0.6);
		}

	}

}
