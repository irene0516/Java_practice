package ex;

/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		com compu = new com();
		System.out.println("請輸入");
		int a = scn.nextInt();
		char c = scn.next().charAt(0);
		if (c == '+' || c == '-' || c == '*' || c == '/') {
			int b = scn.nextInt();
			System.out.println(compu.computer(a, b, c));
		} else if (c == '^' || c == '√' || c == '3') {
			System.out.println(compu.computer(a, 0, c));
		}else{
			System.out.println("錯誤");
		}
	}

}

class com {
	public static float computer(int a, int b, char op) {
		float num = 0;
		switch (op) {
		case '+':
			num = a + b;
			break;
		case '-':
			num = a - b;
			break;
		case '*':
			num = a * b;
			break;
		case '/':
			num = a / b;
			break;
		case '^':
			num = (float) Math.pow(a, 2);
			break;
		case '3':
			num = (float) Math.pow(a, 3);
			break;
		case '√':
			num = (float) Math.sqrt(a);
			break;

		}
		return num;
	}

}
