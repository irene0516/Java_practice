package hw;
/*
 * Topic: ���ϥΪ̿�J�@�����n�A��X1+2+3+�K+m<=n���̤j���m=?
 * Date: 2016/10/24
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�Jn");
		int n = scn.nextInt();
		int sum = 0;
		int i = 1;
		while (sum < n) {
			sum = sum + i;
			i++;
		}
		System.out.println(i - 2);
	}

}
