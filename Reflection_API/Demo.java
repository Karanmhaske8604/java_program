package java_home.Reflection_API;

import java.io.Console;
import java.lang.reflect.Constructor;
import java.time.temporal.IsoFields;

public class Demo {

	public static void main(String[] args) throws Exception{

		Class<?> cl=Class.forName("java_home.Reflection_API.Carr");
		
		Constructor<?> [] con=cl.getDeclaredConstructors();
		
		Constructor<?> con2=cl.getDeclaredConstructor(String.class);
		
		con2.setAccessible(true);

		Carr c=(Carr)con2.newInstance("nanda");
		System.out.println(c.name);
		
		
		
		
		
		
		
		
	}

}
class Carr
{
	 String name;
	
	private Carr(String name)
	{
		this.name=name;
	}

}
