package java_oops;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name of Employee");
		String Name=sc.next();
		//String Name=emp.setName();
			
		
		
		/*emp.name="Aniket";//data member is public 
		System.out.println(emp.name);*/
		
		emp.setName("Karan");//i.e we can change the value 
		System.out.println(emp.getName());
		
		/**emp.e_id="emp1125";
		System.out.println(emp.e_id); //data member is secure because we make it private so no one will interfare with it.
		**/
		
		emp.setE_id("RS121");
		System.out.println(emp.getE_id());
		
		emp.setPass("passward");
		System.out.println(emp.getPass());
				
		emp.setEmail("karanmhaske@gmail.com");
		System.out.println(emp.getEmail());
		
		emp.setSalary(4500);
		System.out.println(emp.getSalary());
		
		emp.setContact("9021644941");
		System.out.println(emp.getContact());
		
	
		emp.setCity("Nanded");
		//System.out.println(emp.getCity());
		
		emp.setState("Maharastra");
		//System.out.println(emp.getState());
		
		emp.setPin(4522);
		//System.out.println(emp.getPin());
		
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
		if(password !=null && password.length()>=8)
		{
			this.password=password;
		}
		else
		{
			System.out.println("password is inappropriate");
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
		if(salary<0)
		{
			System.out.println("no negative value");
		}
		else 
		{
	this.salary=salary;
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
		this.pincode=pincode;
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
