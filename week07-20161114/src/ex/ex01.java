package ex;

/*�мg�@�ӵ{���A�ΰ}�C�x�s�ϥΪ̿�J�� n �Ӿ�ơA�z�L�禡 var() �i�H�^�ǭp��Ӱ}�C�̪��Ʀr���ܲ��ƫ�A�C�L�X���G�C
 * Date: 2016/11/14
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		float data[] = new float[n];
		float sum = 0;
		for (int i = 0; i < n; i++) {
			data[i] = scn.nextInt();
			sum = sum + data[i];
		}
		System.out.println(var(data, n, sum / n) / n);

	}

	public static float var(float data[], int n, float sum) {
		float a = 0;
		for (int i = 0; i < n; i++) {
			a = (float) (a + Math.pow(data[i] - sum, 2));

		}
		return a;

	}

	// public static float var(int data[], int n, int sum) {
	// if (n == 0) {
	// return (float) Math.pow(data[n] - sum, 2);
	//
	// } else {
	// return (float) (Math.pow(data[n] - sum, 2) + var(data, n - 1, sum));
	//
	// }
	//
	// }

}