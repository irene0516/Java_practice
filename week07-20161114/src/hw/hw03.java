package hw;

/*��J��Ӿ�ơA�ϥλ��j��ƩI�s��X C(m,n)�C

 * Date: 2016/11/19
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(c(a) / (c(b) * c(a - b)));

	}

	public static int c(int a) {
		if (a == 1) {
			return 1;
		} else {
			return a * c(a - 1);
		}
	}

}
