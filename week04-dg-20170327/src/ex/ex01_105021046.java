package ex;

import com.sun.prism.paint.Color;

/*
 * Topic: 
 * Date: 
 * Author: 105021046 賴沛錞
 */

public class ex01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir1 = new Circle(2);
		Circle cir2 = new Circle(3);
		Circle cir3 = new Circle(4);
		Rectangle rec1 = new Rectangle(2, 4);
		Rectangle rec2 = new Rectangle(4, 6);
		Rectangle rec3 = new Rectangle(5, 7);
		Triangle tri1 = new Triangle(3, 3, 3);
		Triangle tri2 = new Triangle(5, 12, 13);
		Triangle tri3 = new Triangle(3, 4, 5);
		System.out.println("-----------------------圓形--------------------");
		cir1.show();
		cir2.show();
		cir3.show();
		System.out.println("-----------------------------------------------");
		System.out.println("---------------------四邊形----------------------");
		rec1.show();
		rec2.show();
		rec3.show();
		System.out.println("------------------------------------------------");
		System.out.println("-----------------------三角形-------------------");
		tri1.show();
		tri2.show();
		tri3.show();
		System.out.println("----------------------------------------------");
	}

}

abstract class Shape {
	protected Color color;
	protected boolean isFilled;

	public abstract void show();
}

interface Measure {

	abstract double perimter();

	abstract double area();
}

class Circle extends Shape implements Measure {
	protected float radius;

	public Circle(float r) {
		radius = r;
	}

	public double perimter() {
		return (float) (2 * radius * 3.14159265359);
	}

	public double area() {
		return (float) (radius * radius * 3.14159265359);
	}

	public void show() {
		System.out.print("圓形半徑:" + radius + "\t圓形周長:" + perimter() + "\t\t"+"圓形面積:" + area());
		System.out.println();

	}
}

class Rectangle extends Shape implements Measure {
	private int width, height;

	public Rectangle(int a, int b) {
		width = a;
		height = b;
	}

	public double perimter() {
		return (width + height) * 2;
	}

	public double area() {
		return width * height;
	}

	public void show() {
		System.out.printf("四邊形長和寬:" + width + "," + height + "\t四邊形周長:" + perimter() + "\t四邊形面積:" + area());
		System.out.println();

	}
}

class Triangle extends Shape implements Measure {
	private int width1, width2, width3;

	public Triangle(int a, int b, int c) {
		width1 = a;
		width2 = b;
		width3 = c;
	}

	public double perimter() {
		return width1 + width2 + width3;
	}

	public double area() {
		double s = (double) (width1 + width2 + width3) / 2;
		return Math.sqrt(s * (s - width1) * (s - width2) * (s - width3));
	}

	public void show() {
		System.out.printf(
				"三角形三邊長" + width1 + "," + width2 + "," + width3 + "\t三角形周長:" + perimter() + "\t三角形面積:" + area());
		System.out.println();

	}

}