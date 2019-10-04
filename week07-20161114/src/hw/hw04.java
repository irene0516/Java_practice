package hw;
/*寫一遞迴函數，求 m、n 兩數的最大公因數 gcd(m,n)由鍵盤輸入

 * Date: 2016/11/19
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
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
