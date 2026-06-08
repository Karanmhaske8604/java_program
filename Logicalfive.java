package java_home.LogicalQuestion;

import java.util.Scanner;

public class Logicalfive {

	public static void main(String[] args) {
		//Factorial number
		
		Scanner sc=new Scanner(System.in);
		int factorial=1;
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("Factorial Number: "+factorial);
	}

}
