package java_home;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {

       int num;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the num -");
       num=sc.nextInt();
		
		//int num=12;
		
			
			if(num%2==0)
			{
				System.out.println("The Num is even ");		
			}
			else
			{
				System.out.println("The Num is odd ");
			}
		}

}
