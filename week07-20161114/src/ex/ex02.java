package ex;
/*�ӤW�D�A���Fvar() ��Ƥ��~�A�A�Ϋإߤ@�� std() ��ơA
 * �{���b�������ϥΪ̿�J���@����ư}�C����A�I�sstd()�禡�i�o��}�C���зǮt�A�S�O�`�N�A
 * ���n�u�� std() ��ƺ⵲�G�A������std()�h�I�s var() ��Ƥ���^�� std() �禡�B�z���A�Ǧ^���D�{���A
 * �D�{���A�⵲�G�L�X�C
 * Date: 2016/11/14
 * Author: 105021046 ��K��
 */
import java.util.Scanner;

public class ex02 {
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
		System.out.println(std(var(data, n, sum / n) / n));

	}

	public static float var(float data[], int n, float sum) {
		float a = 0;
		for (int i = 0; i < n; i++) {
			a = (float) (a + Math.pow(data[i] - sum, 2));

		}
		return a;

	}

	public static double std(double a) {
		return Math.sqrt(a);
	}

}
