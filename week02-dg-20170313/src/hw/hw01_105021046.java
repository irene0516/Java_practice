package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class hw01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Teacher> teacher = new ArrayList<Teacher>();
		char a = 'y';
		while (a == 'y' || a == 'Y') {
			System.out.println("請問要新增(A) 刪除(B) 查詢(C) 顯示全部內容(D) 查詢目前有幾位老師(E)?");
			char ch = scn.next().charAt(0);
			if (ch == 'A') {
				System.out.println("請輸入老師名字，老師ID，老師專業");
				teacher.add(new Teacher(scn.next(), scn.next(), scn.next()));
			} else if (ch == 'B') {
				System.out.println("請輸入要刪除的老師名字");
				String str = scn.next();
				for (int i = 0; i < teacher.size(); i++) {
					if (teacher.get(i).getName().equals(str)) {
						teacher.remove(i);
					}
				}
			} else if (ch == 'C') {
				System.out.println("請輸入要查詢的老師名字");
				String str2 = scn.next();
				for (int i = 0; i < teacher.size(); i++) {
					if (teacher.get(i).getName().equals(str2)) {
						teacher.get(i).show();
					}
				}
			}
			// else if(ch=='D'){
			// Teacher.showALL();
			// }
			else if (ch == 'E') {
				System.out.println("目前建立的老師人數" + Teacher.getObjCount());
			}
			System.out.println("是否繼續?(y/n)");
			a = scn.next().charAt(0);
			if (a == 'N' || a == 'n') {
				System.out.println("謝謝使用");
				break;
			}
		}
	}
}

class Teacher {
	private String Name, Id, Research;
	private static int count;

	public Teacher(String name, String id, String research) {
		this.Name = name;
		this.Id = id;
		this.Research = research;
		count++;
	}

	public String getName() {
		return Name;
	}

	public void show() {
		System.out.println("老師名字\t老師id\t老師專業");
		System.out.println(this.Name + "\t" + this.Id + "\t" + this.Research);
	}

	public static int getObjCount() {
		return count;
	}

	// public static void showALL() {
	//
	// System.out.println("老師名字\t老師id\t老師專業");
	// for (int i = 0; i < count; i++) {
	// System.out.println(Name + "\t" + Id + "\t" + Research);
	// }
	// }

}
