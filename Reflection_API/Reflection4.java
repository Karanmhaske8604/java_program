package java_home.Reflection_API;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Reflection4 {

	public static void main(String[] args) throws Exception{
		// Private Fields Access
		
		System.out.println(Cars.class);
		System.out.println();
		
		Class<?> cl=Class.forName("java_home.Reflection_API.Cars");
		
		Constructor<?> [] css=cl.getDeclaredConstructors();//For Constructors Details
		for(Constructor<?> cs:css)
		{
			//System.out.println(cs);
		}
		
		Constructor<?> cls=cl.getDeclaredConstructor(double.class,String.class,String.class);
		//System.out.println(cls);
		cls.setAccessible(true);
		Cars c=(Cars)cls.newInstance(4892.22,"BMW Supra","MH12AJ4512");
		//System.out.println(c);
		
		
		System.out.println("************************************************************************************");
		
		Field[] fields=cl.getDeclaredFields();//For Fields Details.
		for(Field fd:fields)
		{
			//System.out.println(fd);
		}
		
		Field pr=cl.getDeclaredField("price");
		Field no=cl.getDeclaredField("Noplate");
		Field nm=cl.getDeclaredField("name");
		
		pr.setAccessible(true);
		no.setAccessible(true);
		
		pr.setDouble(c,4523.23);
		System.out.println(pr.getDouble(c));
		
		no.set(c,"MH16KI1562");
		System.out.println(no.get(c));
		
		nm.set(c, "Mercedez");
		System.out.println(nm.get(c));
		
		System.out.println("New Car Details: "+pr.getDouble(c)+" "+no.get(c)+" "+nm.get(c));
		
		
		
		
		
		
		
		
		
	}

}

class Cars
{
 private double price;
 public String name;
 private String Noplate;
 
 private Cars(double price,String name,String Noplate)
 {
	 this.name=name;
	 this.price=price;
	 this.Noplate=Noplate;
	 
	 System.out.println("Cars details :"+name+","+price+","+Noplate);
 }
}