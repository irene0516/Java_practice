package hw;
/*
 * Topic: �]�p�@�ӵ{���A���ϥΪ̿�J�@�ӥ����n�A�P�_�ÿ�Xn���h�֦���~�|�j��10000
 * Date: 2016/10/24
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�Jn");
		int n = scn.nextInt();
		int i = 1;
		while (n > 0) {
			if ((int) Math.pow(n, i) > 10000) {
				System.out.println(i);
				break;
			}
			i++;
		}

	}

}
