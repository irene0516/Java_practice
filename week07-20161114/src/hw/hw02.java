package hw;
/*�H���j�]�p��ơA��J�@�ӥ���ƭ�(���t 0)�A�Ǧ^�ӼƭȬO�X���(# ofdigits)�C

 * Date: 2016/11/19
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J");
		int a = scn.nextInt();
		System.out.println(digit(a, 0));

	}

	public static int digit(int a, int b) {

		if (a == 0) {
			return b;
		} else {

			return digit(a / 10, (b+1));

		}

	}

}
