package hw;

import java.util.ArrayList;
import java.util.Scanner;

public class hw01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------Student---------------");
		Student stu1 = new Student("A", "1");
		stu1.addCourse("Math");
		stu1.setScore(80);
		stu1.show();
		stu1.delCourse("Math");
		stu1.show();
		Student stu2 = new Student("B", "2");
		stu2.setScore(90);
		stu2.addCourse("Chinese");
		stu2.show();
		stu2.delCourse("Chinese");
		stu2.show();
		Student stu3 = new Student("C", "3");
		stu3.setScore(60);
		stu3.addCourse("English");
		stu3.show();
		stu3.delCourse("English");
		stu3.show();
		System.out.println("-------------------------------------");
		System.out.println("--------------Teacher----------------");
		Teacher tea1 = new Teacher("a", "1");
		tea1.addCourse("Math");
		tea1.setScore(80);
		tea1.show();
		tea1.delCourse("Math");
		tea1.show();
		Teacher tea2 = new Teacher("b", "2");
		tea2.setScore(60);
		tea2.addCourse("ENGLISH");
		tea2.show();
		tea2.delCourse("ENGLISH");
		tea2.show();
		Teacher tea3 = new Teacher("c", "3");
		tea3.setScore(70);
		tea3.addCourse("CHINESE");
		tea3.show();
		tea3.delCourse("CHINESE");
		tea3.show();
		System.out.println("-----------------------------------");
		System.out.println("-------------Staff-----------------");
		Staff sta1 = new Staff("e", "1");
		sta1.addCourse("MATH");
		sta1.setScore(90);
		sta1.show();
		sta1.delCourse("Math");
		sta1.show();
		Staff sta2 = new Staff("f", "2");
		sta2.addCourse("CHINESE");
		sta2.setScore(60);
		sta2.show();
		sta2.delCourse("Chinese");
		sta2.show();
		Staff sta3 = new Staff("g", "3");
		sta3.addCourse("ENGLISH");
		sta3.setScore(50);
		sta3.show();
		sta3.delCourse("ENGLISH");
		sta3.show();
		System.out.println("------------------------------------");

	}

}

abstract class Person {
	protected String name, id;
	protected float score;

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}

	// ArrayList<Student>stud=new ArrayList<Student>();
	public abstract void show();
}

interface CourseManage {
	public float Score();

	public void addCourse(String course);

	public void delCourse(String course);
}

class Student extends Person implements CourseManage {
	public Student(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	Scanner scn = new Scanner(System.in);
	private String course;

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public float Score() {
		return score;
		// TODO Auto-generated method stub
	}

	@Override
	public void addCourse(String course) {
		// TODO Auto-generated method stub
		this.course = course;

	}

	@Override
	public void delCourse(String course) {
		// TODO Auto-generated method stub
		this.course = null;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("名字:" + name + "\t ID:" + id + "\t分數:" + score + "\t\t課程:" + course);
		System.out.println();

	}

}

class Teacher extends Person implements CourseManage {
	public Teacher(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	private String course;
	private float score;

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public float Score() {
		// TODO Auto-generated method stub
		return score;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("名字:" + name + "\t ID:" + id + "\t分數:" + score + "\t\t課程:" + course);
		System.out.println();
	}

	@Override
	public void addCourse(String course) {
		// TODO Auto-generated method stub
		this.course = course;

	}

	@Override
	public void delCourse(String course) {
		// TODO Auto-generated method stub
		this.course = null;
	}

}

class Staff extends Person implements CourseManage {
	public Staff(String name, String id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	private String course;
	private float score;

	public void setScore(float score) {
		this.score = score;
	}

	@Override
	public float Score() {
		// TODO Auto-generated method stub
		return score;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.printf("名字:" + name + "\t ID:" + id + "\t分數:" + score + "\t\t課程:" + course);
		System.out.println();
	}

	@Override
	public void addCourse(String course) {
		// TODO Auto-generated method stub
		this.course = course;
	}

	@Override
	public void delCourse(String course) {
		// TODO Auto-generated method stub
		this.course = null;
	}

}
