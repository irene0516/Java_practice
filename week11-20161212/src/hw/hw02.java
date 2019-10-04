package hw;

/*
 * Date: 2016/12/12
 * Author: 105021046  ø‡®KÎﬁ
 */
import java.util.Scanner;

public class hw02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine();
		String s[] = str.split(" ");
		int c = 0;
		int b = 0;
		char a = 'Y';
		while (a == 'y' || a == 'Y') {
			for (int i = 0; i < s.length; i++) {
				int sum = 0;
				int d = Integer.parseInt(s[i]);
				for (int j = 0; j < s.length; j++) {
					if (d == Integer.parseInt(s[j])) {
						sum++;
					}
				}
				if (sum > (float) (s.length / 2)) {
					c = 0;
					b = a;
				} else {
					c = 1;

				}
			}
			if (c == 0) {
				System.out.println(b);
			} else {
				System.out.println("NO");
			}
			a = scn.next().charAt(0);
		}
	}
}