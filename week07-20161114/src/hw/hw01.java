package hw;
/*�мg�@��� lcm(x,y,z)�A�D�T�� x�By�Bz ���̤p������
 * Date: 2016/11/19
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J");
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		System.out.println(lcm(lcm(x, y), z));

	}

	public static int lcm(int x, int y) {

		return x * y / cm(x, y);

	}

	public static int cm(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return cm(y, x % y);
		}
	}

}
