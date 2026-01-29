package java_home.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Reflection1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println(Aniket.class);
		
		Class<?> cl=Class.forName("java_home.Reflection_API.Aniket");
		
	
		Constructor<?>[] cs=cl.getDeclaredConstructors();
		
		
		Constructor<?> cs1 = cl.getDeclaredConstructor(int.class);
		
		cs1.setAccessible(true);
		
		Aniket s1 = (Aniket) cs1.newInstance(10);
		
		System.out.println(s1.i);
		
		
		
		

	}

}

class Aniket
{
    int i;
	
	private Aniket(int i)
	{
		System.out.println(i);
		System.out.println("From Private Constructor..");
	}
	
	public Aniket(String s)
	{
		
	}
}
