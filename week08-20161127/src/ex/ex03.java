package ex;

/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		int data[][] = new int[a][b];
		int v[][] = new int[a][d];
		if (b == c) {
			int data2[][] = new int[c][d];

			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					data[i][j] = scn.nextInt();

				}
			}
			for (int i = 0; i < c; i++) {
				for (int j = 0; j < d; j++) {
					data2[i][j] = scn.nextInt();

				}
			}
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < d; j++) {
					for (int k = -1; k < b - 1; k++) {

						v[i][j] = v[i][j] + data[i][k + 1] * data2[k + 1][j];

					}
					System.out.print(v[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}

}
