package ex;

/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入有幾個學號");
		int n = scn.nextInt();
		
		long data[] = new long[n];
		for (int i = 0; i < n; i++) {
			data[i] = scn.nextLong();
		}
		long b;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (data[j] < data[j + 1]) {
					long c = data[j + 1];
					data[j + 1] = data[j];
					data[j] = c;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(data[i]);
		}

	}

}
