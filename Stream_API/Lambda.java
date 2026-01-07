package java_home.Stream_API;

public class Lambda 
{
	public static void main(String [] args)
	{
		I_add<Integer> add=new I_add<Integer>() 
		{
		      public void add(Integer i1,Integer i2)
		      {
		    	  System.out.println(i1+i2);
		      }
		};
	add.add(200, 500);
	}
}


interface I_add<T>
{
   void add(T t1,T t2);
}

//class Concreate implements I_add<Integer>
//{
//
//	@Override
//	public void add(Integer  t1, Integer t2)//autoboxing not work so Give wrapper class name in method sign. 
//	{
//		System.out.println(t1+t2);
//		
//	}
//	
//}


