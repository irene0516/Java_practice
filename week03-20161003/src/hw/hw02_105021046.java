package hw;

import java.util.Scanner;

public class hw02_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�n�X�Ӽ�");
		int n = scn.nextInt();
		int data[] = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = scn.nextInt();
		}
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < n; i++) {
			if (data[i] == 0) {
				b++;
			} else if (data[i] > 0) {
				a++;
			} else if (data[i] < 0) {
				c++;
			}

		}
		System.out.println("���Ƭ�" + a + "��\n" + "����" + b + "��\n" + "�t��" + c + "��");

	}

}
