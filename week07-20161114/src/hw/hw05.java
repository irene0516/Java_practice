package hw;

/*寫一遞迴函數，讓使用者輸入一個長整數，透過遞迴函數運算後得到反向的數字字串並印出。例如:輸入 1234 回傳 4321

 * Date: 2016/11/19
 * Author: 105021046 賴沛錞
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
