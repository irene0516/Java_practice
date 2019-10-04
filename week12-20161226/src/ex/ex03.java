package ex;

/*
 * Topic: OX 遊戲是大家小時候的童年記憶，甚至在長大後，無聊時還是會玩一下呢 ! 但當你一個人時，是否也能讓電腦跟你玩呢 ?
 * Date: 2016/12/26
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int data[][] = new int[3][3];
		int sum = 0;
		boolean boo = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				data[i][j] = scn.nextInt();
				sum = sum + data[i][j];

			}
		}
		if (sum == 4 || sum == 5) {
			for (int i = 0; i < 3; i++) {
				int a = 0;
				for (int j = 0; j < 3; j++) {

					a += data[i][j];
				}
				if (a == 0 || a == 3) {
					boo = false;
				}

			}
			for (int j = 0; j < 3; j++) {
				int b = 0;
				for (int i = 0; i < 3; i++) {
					b += data[i][j];

				}
				if (b == 0 || b == 3) {
					boo = false;
				}

			}
			if (data[0][0] + data[1][1] + data[2][2] == 3 || data[0][0] + data[1][1] + data[2][2] == 0
					|| data[2][0] + data[1][1] + data[0][2] == 0 || data[2][0] + data[1][1] + data[0][2] == 3) {
				boo = false;
			}

		} else {
			System.out.println("false");
		}
if(boo==false){
	System.out.println("true");
}else{
	System.out.println("false");
}
	}

}
