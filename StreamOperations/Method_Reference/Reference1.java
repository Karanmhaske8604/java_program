package java_home.StreamOperations.Method_Reference;

import java.util.List;

public class Reference1 {

	public static void main(String[] args) {
	//1)Static Method Reference
		
	int sum=List.of(10,20,30,40)
		.stream()
		.filter(Demo::add)
		.reduce(1,Demo::take); 
		//.forEach(Demo::show);
	System.out.println(sum);
	}
}

class Demo
{
	public static boolean add(int i)
	{
		System.out.println("I here "+i);
		return i>20;
	}
	
	public static void show(int i)
	{
		//System.out.println("I arrived "+i);
		System.out.println(i);
	}
	
	public static int take(int i,int j)
	{
		return i*j;
	}
	
	
}