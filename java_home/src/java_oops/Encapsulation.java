package java_oops;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of Employee");
		String Name=sc.next();
		//String Name=emp.setName();*/
			
		
		
		emp.name="Aniket";//data member is public so it can have direct access in main method.
		System.out.println(emp.name);
		
		emp.setName("Karan");
		System.out.println(emp.getName());
		
		/**emp.e_id="emp1125";
		System.out.println(emp.e_id); //data member is secure so we an not direct access it.
		**/
		
		emp.setE_id("RS121");
		System.out.println(emp.getE_id());
		
		emp.setPass(" ");
		System.out.println(emp.getPass());
				
		emp.setEmail("karanmhaske@gmail.com");
		System.out.println(emp.getEmail());
		
		emp.setSalary(45000);
		System.out.println(emp.getSalary());
		
		emp.setContact("9021644941");
		System.out.println(emp.getContact());
		
	
		emp.setCity("Nanded");
		System.out.println(emp.getCity());
		
		emp.setState("Maharastra");
		System.out.println(emp.getState());
		
		emp.setPin(45256);
		System.out.println(emp.getPin());
		
		emp.setPost("System Associate");
		//System.out.println(emp.getPost());
	}

}

class Employee
{
	String name;
	private String e_id;
	private  String password;
	private String email;
	private double salary;
	private String contact;
	String city;
	String state;
	int pincode;
	String position;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	
	
	public void setE_id(String e_id)
	{
		this.e_id=e_id;
	}
	public String getE_id()
	{
		return this.e_id;
	}
	
	public void setPass(String password)
	{
		if(password !=null || password.length()>=8)
		{
			System.out.println("password is inappropriate");
		}
		else
		{
			this.password=password;
		}
	}
	public String getPass()
	{
		return this.password;
	}
	
	public void setEmail(String email)
	{
		if(email.endsWith("@gmail.com"))
		{
			this.email=email;
		}
		else
		{
			System.out.println("Enter the correct mail id");
		}
	}
	public String getEmail()
	{
		return this.email;
	}
	
	
	public void setSalary(double salary)
	{ 
		if(salary<0 || salary <35000)
		{
			System.out.println("work hard");
		}
		else if(salary >35000 || salary<45000)
		{
			System.out.println("class D level officer");
		}
		else if(salary>45000 || salary<55000)
		{
			System.out.println("class C level officer");
		}
		else if(salary>55000 || salary<65000)
		{
			System.out.println("class B level officer");
		}
		else if(salary>65000 || salary<75000)
		{
			System.out.println("class A level officer");
		}
		else if(salary>75000)
		{
	     this.salary=salary;
	     System.out.println("salary if good enough");
		}
	}
	public double getSalary()
	{
		return this.salary;
	}
	
	
	public void setContact(String contact)
	{
		if(contact.length()!=10)
		{
			System.out.println("enter ten digits");
		}
		else
		{
			System.out.print("+91 ");
		this.contact=contact;
		}
		
		}
	public String getContact()
	{
		return this.contact;
	}
	
	
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return this.city;
	}
	
	
	public void setState(String state)
	{
		this.state=state;
		
	}
	public String getState()
	{
		return this.state;
	}
	
	
	public void setPin(int pincode)
	{
		if(pincode>6)
		{
			System.out.println("Pincode should be 6 digits");
		}
		else
		{
		this.pincode=pincode;
		}
	}
	public int getPin()
	{
		return this.pincode;
	}
	
	
	public void setPost(String post)
	{
		this.position=post;
	}
	public String getPost()
	{
		return this.position;
	}
	
	
}
