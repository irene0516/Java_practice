package hw;
/*�g�@���j��ơA�D m�Bn ��ƪ��̤j���]�� gcd(m,n)����L��J

 * Date: 2016/11/19
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(gcd(a, b));

	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}

	}

}
