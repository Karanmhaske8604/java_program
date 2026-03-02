package java_home;

public class Class_emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp emp=new Emp();
		emp.empid=11;
		emp.Name="rakesh";
		emp.salary=24525;
		emp.comp();
		
		Emp emp1=new Emp();
		/*emp1.empid= 12; if we don't assign values to the instance variables then compiler print the default values of the datatype.  
		emp1.Name="Rahul"; instance variables store on heap memory allcation. 
		emp.salary=256635.25*/
		emp1.comp();
		System.out.println("Remember Us In Time...");
	}

}
//we have to make class outside of the static method.
class Emp{
	int empid;
	String Name;
	float salary;
	//System.out.println(); in class we can't use the print function.
	public void comp()
	{
		String name="Unique System Skills Limited"; //local store on the stack memory.
		System.out.println("Company Name is "+name);
		
		System.out.println("The Emp id is "+empid);
		System.out.println("The Emp Name is "+Name);
		System.out.println("The Salary of the Emp "+salary);
		System.out.println();
	}
}

