package ex;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Topic: 
 * Date: 
 * Author: 105021046 賴沛錞
 */

public class ex01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<Student> stud = new ArrayList<Student>();
		ArrayList<Teacher> tea = new ArrayList<Teacher>();
		ArrayList<Staff> sta = new ArrayList<Staff>();
		System.out.println("請問要新增還是查詢?");
		String str = scn.next();
		if (str.equals("新增")) {
			System.out.println("請問要加入學生(1)，老師(2)，員工(3)?");
			int a = scn.nextInt();
			switch (a) {
			case 1:
				System.out.println("請輸入名字跟ID");
				stud.add(new Student(scn.next(), scn.next()));
			case 2:
				System.out.println("請輸入名字跟ID");
				tea.add(new Teacher(scn.next(), scn.next()));
				System.out.println();
			case 3:
				System.out.println("請輸入名字跟ID");
				sta.add(new Staff(scn.next(), scn.next()));
			}
		} else if (str.equals("查詢")) {
			System.out.println("請問要查詢學生(1)，老師(2)，員工(3)?");
			int b = scn.nextInt();
			System.out.println("請輸入要查詢的名字");
			String str1 = scn.next();
			switch(str1){
			
			
			}

		}

	}
}

class Person {
	protected String name, id, height, weight, gender, address, email, phone;

	public Person(String name1, String id1) {
		name = name1;
		id = id1;
	}

	public Person() {

	}

	public void setName(String name1) {
		name = name1;
	}

	public String getName() {
		return name;
	}

	public void setId(String Id) {
		id = Id;
	}

	public String getId() {
		return id;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getHeight() {
		return height;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getWeight() {
		return weight;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhone() {
		return phone;
	}

	public void info() {
		System.out.println(this.name + "\t" + this.id);
	}

}

class Teacher extends Person {
	private String degree, profession, webaddress;

	public Teacher(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void setdegree(String degree) {
		this.degree = degree;
	}

	public void setprofession(String profession) {
		this.profession = profession;
	}

	public void setwebaddress(String webaddress) {
		this.webaddress = webaddress;
	}

	public String getdegree() {
		return degree;
	}

	public String getprofession() {
		return profession;
	}

	public String getwebaddress() {
		return webaddress;
	}

	public void info() {
		super.info();
		System.out.println();
	}
}

class Student extends Person {
	private String classname, num;
	private int score;

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void setclassname(String Classname) {
		this.classname = Classname;
	}

	public String getclassname() {
		return classname;
	}

	public void setnum(String Num) {
		this.num = Num;
	}

	public String getnum() {
		return num;
	}

	public void setscore(int Score) {
		this.score = Score;
	}

	public int getscore() {
		return score;
	}

	public void showInfo() {

	}

	public void info() {
		super.info();
		System.out.println(this.classname + "\t" + this.num + "\t" + this.score);
	}

	public static ArrayList<Student> list = new ArrayList<Student>();

	public void showAll() {
		int n = list.size();
	}
}

class Staff extends Person {
	public Staff(String name, String id) {
		this.name = name;
		this.id = id;
	}
}
