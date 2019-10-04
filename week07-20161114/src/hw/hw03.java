package hw;

/*輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。

 * Date: 2016/11/19
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
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
