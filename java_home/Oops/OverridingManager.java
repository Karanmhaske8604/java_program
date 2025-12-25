package java_home.Oops;

import java.util.Scanner;

public class OverridingManager {

	public static void main(String[] args) {
		// Dynamic Method Dispatch.
		Scanner sc=new Scanner(System.in);
	
		Workers[] em=new Workers[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter1-Employee, 2-Manager: ");
			int choice=sc.nextInt();
			if(choice == 1)
				em[i] = new Workers();
			else
				em[i] = new Manager();
			em[i].accept(sc);
		}
		System.out.println("The objects  are :");
		for(int i=0;i<5;i++)
		{
			if(em[i].getClass().getName().equals("Employee"))
				System.out.println("----Employee object----");
			else
				System.out.println("----Manager  object----");
			em[i].display();
			//sc.close();
		}
	}
}

class Workers
{
	int id;
	String name;
	
	void accept(Scanner sc)
	{
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id and Name: ");
		id=sc.nextInt();
		name=sc.next();
	}
	
   void display()
   {
	   System.out.println("Id = "+ id +",Name = " + name);
	  
   }
}

class Manager extends Workers
{
	int salary;
	
	void accept(Scanner sc)
	{ 
	  //Scanner sc=new Scanner(System.in);
	  super.accept(sc);
	  System.out.println("Enter the Salary-");
	  salary=sc.nextInt();	  
	}
	
	void display()
	{
		super.display();
		System.out.println("Salary="+salary);
	}
}
