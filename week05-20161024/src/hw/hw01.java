package hw;
/*
 * Topic:���ϥΪ̿�J�@����� n�A�H�r�� '*' ��X����� n ������� (�ЧQ�ΰj��A���n������ printf �覡������X)�C
 * Date: 2016/10/24
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���");
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
