package hw;
/*以遞迴設計函數，輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。

 * Date: 2016/11/19
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
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
