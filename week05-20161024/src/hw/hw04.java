package hw;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A�p��1/(1*2)+1/(3*4)+1/(5*6)+�K+1/[(2n-1)*(2n)]�ÿ�X���G
 * Date: 2016/10/24
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J");
		int n = scn.nextInt();
		float sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (float)1 / ((2 * i - 1) * (2 * i));

		}
		System.out.println(sum);

	}

}
