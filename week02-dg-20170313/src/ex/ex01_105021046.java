package ex;
/*
 * Topic: 
 * Date: 
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;
public class ex01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char str = 'y';
		while (str == 'y' || str == 'Y') {
			System.out.println("請選擇要圓形，三角形還是長方形");
			String b = scn.next();
			if (b.equals("圓形")) {
				System.out.println("請輸入半徑");
				Shape a = new Shape(scn.nextFloat());
				System.out.println(a.getPermiter());
				System.out.println(a.getArea());
			} else if (b.equals("三角形")) {
				System.out.println("請輸入長寬跟角度");
				Shape triangle = new Shape(scn.nextInt(), scn.nextInt(), scn.nextInt());
				System.out.println(triangle.getPermiter());
				System.out.println(triangle.getArea());

			} else {
				System.out.println("請輸入長跟寬");
				Shape square = new Shape(scn.nextInt(), scn.nextInt());
				System.out.println(square.getPermiter());
				System.out.println(square.getArea());
			}
			System.out.println("目前備建立的物件有" + Shape.getcount() + "個");
			System.out.println("是否繼續(Y/N)");
			str = scn.next().charAt(0);
			if (str == 'N' || str == 'n') {
				System.out.println("謝謝使用");
				break;
			}
		}
	}

}

class Shape {
	private int length, width, angle, type;
	private double radius;
	private static int count;

	public Shape(int a, int b) {
		length = a;
		width = b;
		type = 1;
		count++;
	}

	public Shape(int a, int b, int c) {
		length = a;
		width = b;
		angle = c;
		type = 2;
		count++;
	}

	public Shape(float a) {
		radius = a;
		type = 3;
		count++;
	}

	public float getPermiter() {
		float result = 0.0f;
		switch (type) {
		case 1:
			result = 2 * (width + length);
			break;
		case 2:
			result = width + length + (float) Math.sqrt(
					width * width + length * length - 2 * width * length * (float) Math.cos(Math.toRadians(angle)));
			break;
		case 3:
			result = (float) (2 * radius * 3.14159265);
			break;

		}
		return result;

	}

	public double getArea() {
		double result = 0.0f;
		switch (type) {
		case 1:
			result = width * length;
			break;
		case 2:
			result = (double) (((double) 1 / 2) * width * length * Math.sin(Math.toRadians(angle)));
			break;
		case 3:
			result = (float) (radius * radius * 3.14159265);
			break;

		}
		return result;

	}

	public static int getcount() {
		return count;
	}
}
