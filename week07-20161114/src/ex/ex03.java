package ex;
/*�мg�@�ӵ{���A���ϥΪ̿�J�@�Ӿ�ƤG���}�C�A�إ� var2()�禡 ��std2()�i�H���O�p��G���}�C���ܲ��ƻP�зǮt�A
 * �ç⵲�G�^�Ǩ�D�{���L�X�C
 * Date: 2016/11/14
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int data[][] = new int[n][n];
		float sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				data[i][j] = scn.nextInt();
				sum += data[i][j];
			}
		}
		System.out.println(var2(data, n, sum / (n * n)) / (n * n));
		System.out.println(std2(var2(data, n, sum / (n * n)) / (n * n)));

	}

	public static float var2(int data[][], int n, float sum) {
		float a = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a = (float) (a + Math.pow(data[i][j] - sum, 2));
			}
		}
		return a;
	}

	public static double std2(float b) {
		return Math.sqrt(b);
	}

}
