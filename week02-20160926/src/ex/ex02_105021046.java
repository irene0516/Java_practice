package ex;
import java.util.Scanner;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021046 賴沛錞
 */

public class ex02_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入x,y");
		int n = scn.nextInt();
		int m = scn.nextInt();
		if (Math.pow(n, 2) + Math.pow(m, 2) <= 10000) {
			System.out.println("在圓形內");
		} else {
			System.out.println("在圓形外");
		}

	}
	}


