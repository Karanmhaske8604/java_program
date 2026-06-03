package java_home;

import java.util.Scanner;

public class Stringclass {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			
			System.out.println("Enter the string");
			String s=sc.nextLine();
			int a=sc.nextInt();
			System.out.println(a);
			System.out.println(s);
		}

	}

}
