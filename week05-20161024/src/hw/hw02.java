package hw;
/*
 * Topic: 讓使用者輸入一正整數n，輸出1+2+3+…+m<=n的最大整數m=?
 * Date: 2016/10/24
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入n");
		int n = scn.nextInt();
		int sum = 0;
		int i = 1;
		while (sum < n) {
			sum = sum + i;
			i++;
		}
		System.out.println(i - 2);
	}

}
