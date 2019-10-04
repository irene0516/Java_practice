package hw;
import java.util.Scanner;
public class hw01_105021046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("½Ð¿é¤J¢ö"
				+ "");
		int n=scn.nextInt();
		int v1=1;
		int v2=1;
		int v3=0;
		System.out.print("1,1,");
		while(n!=v3){
			 v3=v1+v2;
			 v2=v1;
			 v1=v3;
			 System.out.print(v3+",");
		}
		

	}

}
