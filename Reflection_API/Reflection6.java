package java_home.Reflection_API;

import java.lang.reflect.Constructor;

public class Reflection6 {

	public static void main(String[] args)throws Exception {
		// Private Method Access
		System.out.println(Emp_details.class);
		
		Class<?>cl=Emp_details.class;
		
		Constructor<?>ctr[]=cl.getDeclaredConstructors();
		for(Constructor<?> cr:ctr)
		{
			System.out.println(cr);
		}
		
		Constructor<?>con=cl.getDeclaredConstructor(int.class);
		

	}

}

class Emp_details
{
	private int id;
	
	private Emp_details(int id)
	{
		this.id=id;
	}
	
	private int getid()
	{
		return this.id=id;
		
	}

}
