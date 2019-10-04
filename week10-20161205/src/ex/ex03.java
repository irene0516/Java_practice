package ex;

/*
 * Topic: 請設計 Person 類別 (姓名,性別,身高,體重)，使用者可以新增個人資料，每新增一筆就會列出目前的資料串有哪些人，而這些資料請用插入排序法依每一個人的 BMI 值由大到小排序。
 * Date: 2016/12/05
 * Author: 105021046 賴沛錞
 */
import java.util.Scanner;
import java.util.ArrayList;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> person = new ArrayList<Person>();
		String str[] = { "person", "gender", "hieght", "weight", "BMI" };
		boolean boo = true;
		while (boo = true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("請加入人名，性別，身高，體重");
			person.add(new Person(scn.next(), scn.next(), scn.nextFloat(), scn.nextFloat()));
			Person a;
			for (int i = 0; i < person.size(); i++) {
				for (int j = 0; j < i; j++) {
					if (person.get(i).BMI() > person.get(j).BMI()) {
						a = person.get(i);
						person.set(i, person.get(j));
						person.set(j, a);
					}
				}
			}

			for (int i = 0; i < 5; i++) {
				System.out.print(str[i] + "\t");
			}
			System.out.println();
			for (int i = 0; i < person.size(); i++) {
				person.get(i).pri();
				System.out.println(person.get(i).BMI());
			}
			System.out.println();
			System.out.println("continue?");
			char ch = scn.next().charAt(0);
			if (ch == 'Y' || ch == 'y') {
				boo = true;
			} else {
				System.out.println("Thank you for using this program");
				break;
			}
		}

	}
}

class Person {
	private String name, gender;
	private float height, weight;

	public Person(String Name, String Gender, float Height, float Weight) {
		name = Name;
		gender = Gender;
		height = Height;
		weight = Weight;

	}

	public void pri() {
		System.out.print(name + "\t");
		System.out.print(gender + "\t");
		System.out.print(height + "\t");
		System.out.print(weight + "\t");

	}

	public float BMI() {
		return weight / ((height / 100) * (height / 100));
	}

}
