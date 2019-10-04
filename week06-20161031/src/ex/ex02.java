package ex;

/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int m = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(fun2(m) / (fun2(n) * fun2(m - n)));

	}

	public static int fun2(int a) {
		int sum = 1;
		for (int i = 1; i <= a; i++) {
			sum *= i;
		}
		return sum;

	}

}
