package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str[] = { "name(id)","English","Math","Chinese","Avange" };
		ArrayList<Student> studList = new ArrayList<Student>();
		System.out.println("請輸入學號，姓名，英文，數學，國文成績");
		boolean boo = true;
		while (boo = true) {
			studList.add(new Student(scn.next(), scn.next(), scn.nextInt(), scn.nextInt(), scn.nextInt()));

			for (int i = 0; i < studList.size(); i++) {
				Student a;
				for (int j = 0; j < studList.size(); j++) {
					if (studList.get(i).avange() > studList.get(j).avange()) {
						a = studList.get(i);
						studList.set(i, studList.get(j));
						studList.set(j, a);

					}

				}
			}
			for (int i = 0; i < 5; i++) {
				System.out.print(str[i] + "\t");
			}
			System.out.println();
			for (int i = 0; i < studList.size(); i++) {
				studList.get(i).show();
			}
			System.out.println("Continue?");
			char a = scn.next().charAt(0);
			if (a == 'n' || a == 'N') {
				System.out.println("Thank you for using this program");
				boo = false;
				break;
			}

		}
	}
}

class Student {
	private String Id, Name;
	private int English, Math, Chinese;

	public Student(String id, String name, int eng, int mat, int chi) {
		Id = id;
		Name = name;
		English = eng;
		Math = mat;
		Chinese = chi;

	}

	public void show() {
		System.out.print(Name);
		System.out.print("(" + Id + ")\t\t");
		System.out.print(English + "\t");
		System.out.print(Math + "\t");
		System.out.print(Chinese + "\t");
		System.out.println(avange());

	}

	public int avange() {
		return (English + Math + Chinese) / 3;
	}

}
