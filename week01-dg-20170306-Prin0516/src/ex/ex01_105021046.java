package ex;
/*
 * Topic: 
 * Date: 
 * Author: 105021046 賴沛錞
 */

public class ex01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teacher1[] tc = new teacher1[3];
		tc[0] = new teacher1();
		tc[0].setName("1");
		tc[0].setId("123");
		tc[0].setResearch("資工");
		tc[1] = new teacher1();
		tc[1].setName("2");
		tc[1].setId("456");
		tc[1].setResearch("資傳");
		tc[2] = new teacher1();
		tc[2].setName("3");
		tc[2].setId("789");
		tc[2].setResearch("資管");
		for (int i = 0; i < 3; i++) {
			System.out.println(tc[i].getName());
			System.out.println(tc[i].getId());
			System.out.println(tc[i].getResearch());
		}
		staff[] st = new staff[3];
		st[0] = new staff();
		st[0].setName("甲");
		st[0].setId("123");
		st[0].setAp("助理");
		st[1] = new staff();
		st[1].setName("乙");
		st[1].setId("456");
		st[1].setAp("經理");
		st[2] = new staff();
		st[2].setName("丙");
		st[2].setId("789");
		st[2].setAp("總經理");
		for (int i = 0; i < 3; i++) {
			System.out.println(st[i].getName());
			System.out.println(st[i].getId());
			System.out.println(st[i].getAp());
		}
		student[] sd = new student[3];
		sd[0] = new student();
		sd[0].setName("A");
		sd[0].setId("123");
		sd[0].setHeight("165");
		sd[1] = new student();
		sd[1].setName("B");
		sd[1].setId("456");
		sd[1].setHeight("170");
		sd[2] = new student();
		sd[2].setName("C");
		sd[2].setId("789");
		sd[2].setHeight("180");
		for (int i = 0; i < 3; i++) {
			System.out.println(sd[i].getName());
			System.out.println(sd[i].getId());
			System.out.println(sd[i].getHeight());
		}

	}

}

class teacher1 {
	private String name, id, research;

	public void setName(String str) {
		this.name = str;
	}

	public void setId(String str) {
		this.id = str;
	}

	public void setResearch(String str) {
		this.research = str;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getResearch() {
		return research;
	}

}

class staff {
	private String name, id, ap;

	public void setName(String str) {
		this.name = str;
	}

	public void setId(String str) {
		this.id = str;
	}

	public void setAp(String str) {
		this.ap = str;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getAp() {
		return ap;
	}
}

class student {
	private String name, id, height;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
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

}
