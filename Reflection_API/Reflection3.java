package java_home.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Reflection3 {

	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
		
		
		Class<?> cl = Company.class;
		Constructor<?>[] cr =cl.getDeclaredConstructors();
		Constructor <?> cr2=cl.getDeclaredConstructor(int.class,String.class,double.class);
		cr2.setAccessible(true);
	     Company comp =(Company)cr2.newInstance(101,"keshv",100.03);
	     
	     
	     Field [] field =cl.getDeclaredFields();
	     
	     Field f2=cl.getDeclaredField("id");
	     f2.setAccessible(true);
	     System.out.println(f2.get(comp));
	     
	     Field f3=cl.getDeclaredField("salary");
	     f3.setAccessible(true);
	     System.out.println(f3.get(comp));
	     
	     Field f4=cl.getDeclaredField("dpt");
	     f4.setAccessible(true);
	     System.out.println(f4.get(comp));
		
		

	}	
}

class Company {
	
	private int id=3243;
	private String dpt;
	public double salary;

	private Company(int id, String dpt, double salary) {
	//	this.id = id;
		this.dpt = dpt;
		this.salary = salary;
//		System.out.println("My id " + id + " and Department id" + dpt);
//		System.out.println("salary is " + salary);
	}
	
	private Company(Double salary)
	{

		this.salary=salary;
		
		System.out.println("Salary:"+salary);
	}

}
