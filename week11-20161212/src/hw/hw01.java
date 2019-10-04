package hw;

/*
 * Date: 2016/12/12
 * Author: 105021046  ø‡®KÎﬁ
 */
import java.util.Scanner;

public class hw01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int n = scn.nextInt();

		for (int i = 0; i < str.length(); i++) {

			char a = str.charAt(i);
			if (a >= 65 && a <= 90) {
				if (a + n >= 90) {
					System.out.print((char) (a - 25 + n - 1));
				} else {
					System.out.print((char) (a + n));
				}
			} else if (a >= 97 && a <= 122) {
				if (a + n >= 122) {
					System.out.print((char) (a - 25 + n - 1));
				} else {
					System.out.print((char) (a + n));
				}
			}

			else {
				System.out.print((char) a);
			}
		}
	}
}
