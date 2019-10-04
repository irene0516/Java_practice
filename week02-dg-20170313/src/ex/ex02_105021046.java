package ex;

import java.util.Scanner;
import java.util.ArrayList;

public class ex02_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Teacher> teacher = new ArrayList<Teacher>();
		ArrayList<Student>student=new ArrayList<Student>();
		ArrayList<Staff>staff=new ArrayList<Staff>();
		
		char ch = 'y';
		while (ch == 'y' || ch == 'Y') {
			System.out.println("請輸入老師名字");
			teacher.add(new Teacher(scn.next()));
			System.out.println("請問要增加課程嗎?(YES/NO)");
			String str = scn.next();
			if (str.equals("YES") || str.equals("yes")) {
				System.out.println("請輸入課程名字和課程代碼和修課人數上限");
				Teacher.add();
			}
			System.out.println("目前課程個數:"+Teacher.getcount());
			System.out.println("目前課程資訊:");
			System.out.println("課程\t編號\t修課人數上限");
			Teacher.getcourse();
			System.out.println("是否繼續使用?");
			ch = scn.next().charAt(0);
			if (ch == 'n' || ch == 'N') {
				System.out.println("謝謝使用");
				break;
			}

		}
	}

}

class Teacher {
	static Scanner scn = new Scanner(System.in);
	private String name;
	private static int count=0;
	
	private static ArrayList<Course> coursedata = new ArrayList<Course>();

	public Teacher(String name1) {
		name = name1;
	}

	public static void add() {
		count++;
		coursedata.add(new Course(scn.next(), scn.next(), scn.next()));
	}

	public static void getcourse() {
		for (int i = 0; i < coursedata.size(); i++) {
			coursedata.get(i).getCourse();
		}
	}

	public static int getcount() {
		return count;
	}

	private static class Course {
		private String classname, id, num;

		public Course(String str1, String str2, String str3) {
			classname = str1;
			id = str2;
			num = str3;
		}

		public void getCourse() {
			System.out.println(classname + "\t" + id + "\t" + num);
		}
	}
}
class Student{
	
}
class Staff{
	
}