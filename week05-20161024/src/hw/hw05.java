package hw;
/*
 * Topic: 有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣，方陣結構如下，例如 n=5 時： 
 * Date: 2016/10/24
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int n = scn.nextInt();
		int data[][] = new int[n][n];
		data[0][0] = 1;
		if (n > 0 && n < 21) {
			for (int i = 1; i < n; i++) {
				data[i][0] = data[i - 1][0] + i;

			}
			for (int i = 0; i < n; i++) {
				int b = 2 + i;
				for (int j = 1; j < n - i; j++) {
					data[i][j] = data[i][j - 1] + b;
					b++;
				}

			}
			for (int i = 1; i < n; i++) {
				int c = n;
				for (int j = n - i; j < n; j++) {
					data[i][j] = data[i][j - 1] + c;
					c--;

				}

			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(data[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("請重新輸入");
		}
	}
}
	