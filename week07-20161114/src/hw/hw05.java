package hw;

/*�g�@���j��ơA���ϥΪ̿�J�@�Ӫ���ơA�z�L���j��ƹB���o��ϦV���Ʀr�r��æL�X�C�Ҧp:��J 1234 �^�� 4321

 * Date: 2016/11/19
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Long a = scn.nextLong();
		contrast(a);

	}

	public static void contrast(Long a) {
		if (a > 0) {
			System.out.print(a % 10);
			contrast(a / 10);
		}

	}

}
