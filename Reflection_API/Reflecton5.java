package java_home.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Reflecton5 {

	public static void main(String[] args)throws Exception {
		//System.out.println(Indus.class);
		
		Class<?> cl=Class.forName("java_home.Reflection_API.Indus");
		Constructor<?>[] ctr=cl.getDeclaredConstructors();
		for(Constructor<?> cr:ctr)
		{
			System.out.println(cr);
		}
		Constructor<?> cr1=cl.getDeclaredConstructor();
		
		cr1.setAccessible(true);
		Indus i=(Indus)cr1.newInstance();
		
		//Fields
		
		 Field [] fds=cl.getDeclaredFields();
		 for(Field fd:fds)
		 {
			 System.out.println(fd);
		 }
		 
		 Field n=cl.getDeclaredField("Name");
		// System.out.println(n);
		 Field l=cl.getDeclaredField("location");
		 
		 n.setAccessible(true);
		 n.set(i,"Sindhu");
		 System.out.println(n.get(i));
		 
		 l.set(i,"Punjab");
		 System.out.println(l.get(i));
		 
		 System.out.print(n.get(i)+" "+ l.get(i));

	}

}

class Indus
{
 private String Name;
 public  String location;
 
 private Indus()
 {
	 //this.Name=Name;
	 System.out.println("Object  created...");
 }
}