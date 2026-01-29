package java_home.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection2 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		/* Reflection_API by 3 ways
		* 1)Class.forName(),2).getClass(),3).Class()
		*/
		 System.out.println(Bussiness.class);
		 System.out.println();
		
		Class<?>cl=Class.forName("java_home.Reflection_API.Bussiness");
		
		Constructor<?>[] ct =cl.getDeclaredConstructors();
		
		for(Constructor<?>c:ct)
		{
			System.out.println(c);
			System.out.println(c.getName());
			System.out.println(c.getParameterCount());
			
			Class<?>[] pt =c.getParameterTypes();
			for(Class<?> p:pt)
			{
				System.out.println(p);
			}
			System.out.println();
		}
			
			Constructor<?> ct2=cl.getDeclaredConstructor(int.class);
			System.out.println(ct2);
						
			ct2.setAccessible(true);
			Bussiness bs=(Bussiness) ct2.newInstance(1200);
			System.out.println(bs.i);
		
	
	}

}

class Bussiness
{
	int i;
	private Bussiness()
	{
		
	}
	private Bussiness(int i)
	{
		System.out.println(i*2);
	}
	public Bussiness(String name)
	{
		
	}
}

