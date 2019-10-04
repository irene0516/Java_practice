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
			System.out.println("�аݭn�s�W(A) �R��(B) �d��(C) ��ܥ������e(D) �d�ߥثe���X��Ѯv(E)?");
			char ch = scn.next().charAt(0);
			if (ch == 'A') {
				System.out.println("�п�J�Ѯv�W�r�A�ѮvID�A�Ѯv�M�~");
				teacher.add(new Teacher(scn.next(), scn.next(), scn.next()));
			} else if (ch == 'B') {
				System.out.println("�п�J�n�R�����Ѯv�W�r");
				String str = scn.next();
				for (int i = 0; i < teacher.size(); i++) {
					if (teacher.get(i).getName().equals(str)) {
						teacher.remove(i);
					}
				}
			} else if (ch == 'C') {
				System.out.println("�п�J�n�d�ߪ��Ѯv�W�r");
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
				System.out.println("�ثe�إߪ��Ѯv�H��" + Teacher.getObjCount());
			}
			System.out.println("�O�_�~��?(y/n)");
			a = scn.next().charAt(0);
			if (a == 'N' || a == 'n') {
				System.out.println("���¨ϥ�");
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
		System.out.println("�Ѯv�W�r\t�Ѯvid\t�Ѯv�M�~");
		System.out.println(this.Name + "\t" + this.Id + "\t" + this.Research);
	}

	public static int getObjCount() {
		return count;
	}

	// public static void showALL() {
	//
	// System.out.println("�Ѯv�W�r\t�Ѯvid\t�Ѯv�M�~");
	// for (int i = 0; i < count; i++) {
	// System.out.println(Name + "\t" + Id + "\t" + Research);
	// }
	// }

}
