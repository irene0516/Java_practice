package ex;
/*讓使用者輸入一個正整數 n，接著使用遞迴呼叫印出 n! 的結果。
 * Date: 2016/11/14
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(var(n));

	}

	public static int var(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * var(n - 1);
		}
	}
}
