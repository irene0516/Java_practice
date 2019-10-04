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
			System.out.println("請選擇你要新增，刪除還是查看?");
			String str = scn.next();
			if (str.equals("新增")) {
				System.out.println("請選擇你要新增學生，老師還是員工?");
				String cho = scn.next();
				if (cho.equals("學生")) {
					System.out.println("請輸入名字，學號，身高");
					stud.add(new Student(scn.next(), scn.next(), scn.nextInt()));
				} else if (cho.equals("老師")) {
					System.out.println("請輸入名字，工作證號碼，學程");
					tea.add(new Teacher(scn.next(), scn.next(), scn.next()));
				} else {
					System.out.println("請輸入名字，工作證號碼，職位");
					sta.add(new Staft(scn.next(), scn.next(), scn.next()));
				}
			} else if (str.equals("刪除")) {
				System.out.println("請輸入要刪除哪個類別和刪除的名字?");
				String delclas = scn.next();
				String delname = scn.next();
				if (delclas.equals("學生")) {
					for (int i = 0; i < stud.size(); i++) {
						if (delname.equals(stud.get(i).getname())) {
							stud.remove(i);
						}
					}
					for (int j = 0; j < stud.size(); j++) {
						stud.get(j).info();
					}
				} else if (delclas.equals("老師")) {
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
			} else if (str.equals("查看")) {
				System.out.println("請輸入要查看的類別跟名字");
				String str1 = scn.next();
				String str2 = scn.next();
				if (str1.equals("學生")) {
					for (int i = 0; i < stud.size(); i++) {
						if (str2.equals(stud.get(i).getname())) {
							stud.get(i).info();

						}
					}
					System.out.println();
				} else if (str1.equals("老師")) {
					for (int i = 0; i < tea.size(); i++) {
						if (str2.equals(tea.get(i).getname())) {
							tea.get(i).info();
						}
					}
					System.out.println();
				} else if (str1.equals("員工")) {
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
			System.out.println("是否繼續(Y/N)");
			a = scn.next().charAt(0);
			if (a == 'n' || a == 'N') {
				System.out.println("謝謝使用");
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
		System.out.println("學生名單");
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
		System.out.println("老師名單");
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
		System.out.println("員工名單");
		System.out.print(name + "\t");
		System.out.print(id + "\t");
		System.out.println(ap);
	}
}
