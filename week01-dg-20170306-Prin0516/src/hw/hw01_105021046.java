package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class hw01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> stud = new ArrayList<Student>();
		ArrayList<Teacher> tea = new ArrayList<Teacher>();
		ArrayList<Staft> sta = new ArrayList<Staft>();
		Scanner scn = new Scanner(System.in);
		Boolean boo = true;
		char a = 'y';
		while (a == 89 || a == 121) {
			System.out.println("�п�ܧA�n�s�W�A�R���٬O�d��?");
			String str = scn.next();
			if (str.equals("�s�W")) {
				System.out.println("�п�ܧA�n�s�W�ǥ͡A�Ѯv�٬O���u?");
				String cho = scn.next();
				if (cho.equals("�ǥ�")) {
					System.out.println("�п�J�W�r�A�Ǹ��A����");
					stud.add(new Student(scn.next(), scn.next(), scn.nextInt()));
				} else if (cho.equals("�Ѯv")) {
					System.out.println("�п�J�W�r�A�u�@�Ҹ��X�A�ǵ{");
					tea.add(new Teacher(scn.next(), scn.next(), scn.next()));
				} else {
					System.out.println("�п�J�W�r�A�u�@�Ҹ��X�A¾��");
					sta.add(new Staft(scn.next(), scn.next(), scn.next()));
				}
			} else if (str.equals("�R��")) {
				System.out.println("�п�J�n�R���������O�M�R�����W�r?");
				String delclas = scn.next();
				String delname = scn.next();
				if (delclas.equals("�ǥ�")) {
					for (int i = 0; i < stud.size(); i++) {
						if (delname.equals(stud.get(i).getname())) {
							stud.remove(i);
						}
					}
					for (int j = 0; j < stud.size(); j++) {
						stud.get(j).info();
					}
				} else if (delclas.equals("�Ѯv")) {
					for (int i = 0; i < tea.size(); i++) {
						if (delname.equals(tea.get(i).getname())) {
							tea.remove(i);
						}
					}
					for (int j = 0; j < tea.size(); j++) {
						tea.get(j).info();
					}
				} else {
					for (int i = 0; i < sta.size(); i++) {
						if (delname.equals(sta.get(i).getname())) {
							sta.remove(i);
						}
					}
					for (int j = 0; j < sta.size(); j++) {
						sta.get(j).info();
					}
				}
			} else if (str.equals("�d��")) {
				System.out.println("�п�J�n�d�ݪ����O��W�r");
				String str1 = scn.next();
				String str2 = scn.next();
				if (str1.equals("�ǥ�")) {
					for (int i = 0; i < stud.size(); i++) {
						if (str2.equals(stud.get(i).getname())) {
							stud.get(i).info();

						}
					}
					System.out.println();
				} else if (str1.equals("�Ѯv")) {
					for (int i = 0; i < tea.size(); i++) {
						if (str2.equals(tea.get(i).getname())) {
							tea.get(i).info();
						}
					}
					System.out.println();
				} else if (str1.equals("���u")) {
					for (int i = 0; i < sta.size(); i++) {
						if (str2.equals(sta.get(i).getname())) {
							sta.get(i).info();
						}
					}
					System.out.println();
				}
			}
			for (int i = 0; i < stud.size(); i++) {
				stud.get(i).info();
			}
			for (int i = 0; i < tea.size(); i++) {
				tea.get(i).info();
			}
			for (int i = 0; i < sta.size(); i++) {
				sta.get(i).info();
			}
			System.out.println("�O�_�~��(Y/N)");
			a = scn.next().charAt(0);
			if (a == 'n' || a == 'N') {
				System.out.println("���¨ϥ�");
				break;
			}
		}
	}
}

class Student {
	private String name, id;
	private int height;

	public Student(String name1, String id1, int height1) {
		name = name1;
		id = id1;
		height = height1;
	}

	public String getname() {
		return name;
	}

	public void info() {
		System.out.println("�ǥͦW��");
		System.out.print(name + "\t");
		System.out.print(id + "\t");
		System.out.println(height);
	}
}

class Teacher {
	private String name, id, research;

	public Teacher(String name1, String id1, String research1) {
		name = name1;
		id = id1;
		research = research1;
	}

	public String getname() {
		return name;
	}

	public void info() {
		System.out.println("�Ѯv�W��");
		System.out.print(name + "\t");
		System.out.print(id + "\t");
		System.out.println(research);
	}
}

class Staft {
	private String name, id, ap;

	public Staft(String name1, String id1, String ap1) {
		name = name1;
		id = id1;
		ap = ap1;
	}

	public String getname() {
		return name;
	}

	public void info() {
		System.out.println("���u�W��");
		System.out.print(name + "\t");
		System.out.print(id + "\t");
		System.out.println(ap);
	}
}
