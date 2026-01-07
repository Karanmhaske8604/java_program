package java_home.Stream_API;

public class Lambda2 {

	public static void main(String[] args)
	{
		
		A_add<Integer> ad=(i1,i2)->(i1+i2);
		
		int sum=ad.add(45, 90);
		System.out.println(sum);
	}

}

interface A_add<T>
{
 T add(T t1,T t2); 	
}