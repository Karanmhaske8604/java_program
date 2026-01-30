package java_home.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Reflection1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println(Aniket.class);
		System.out.println();
		
		Class<?> cl=Class.forName("java_home.Reflection_API.Aniket");
		
	
		Constructor<?>[] cs=cl.getDeclaredConstructors();
		for(Constructor<?> c:cs)
		{
			//System.out.println(c);
			System.out.println(c.getName());
			System.out.println(c.getParameterCount());
			System.out.println(Arrays.toString(c.getParameterTypes()));
			
			Class<?>[]pt=c.getParameterTypes();
			for(Class<?>p:pt)
			{
				//System.out.println(p);
			}
		}
		
		
		Constructor<?> cs1 = cl.getDeclaredConstructor(int.class);
		Constructor<?> cs2 = cl.getDeclaredConstructor(String.class,int.class);
		cs1.setAccessible(true);
		cs2.setAccessible(true);
		
		Aniket s1 = (Aniket) cs1.newInstance(10);
		Aniket s2 = (Aniket) cs2.newInstance("karan",10);
	
		
		System.out.println(s1.i);
		System.out.println(s2+ " " + s2.i);		
	}
}

class Aniket
{
    int i;
    String s;
	
	private Aniket(int i)
	{
		System.out.println(i);
		System.out.println("From Private Constructor..");
	}
	
	private Aniket(String s,int i)
	{
		System.out.println("I am "+s+" and i am "+i+" years old");
	}
}
