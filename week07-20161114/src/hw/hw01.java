package hw;
/*請寫一函數 lcm(x,y,z)，求三數 x、y、z 之最小公倍數
 * Date: 2016/11/19
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
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
