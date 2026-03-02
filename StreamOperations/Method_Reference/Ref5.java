package java_home.StreamOperations.Method_Reference;

import java.util.List;

public class Ref5 {

	public static void main(String[] args) {
		// Method References types
		
		List.of(12,15,16,18)
		.stream()
		.filter(show::test)//Static method Ref.
		.forEach((i)->{System.out.println(i);});
		System.out.println("#############################################");
		
		//Instance method Ref.
		show s=new show();
		List.of(20,50,80,110)
		.stream()
		.filter(s::best)
		.forEach((i)->{System.out.println(i);});
		System.out.println("********************************************");
		
		//Particular Object.
		String S="Hello Ji ";
		
		List.of("Karan","Mahesh","Pranav","Abhishek")
		.stream()
		.map(S::concat)
		.forEach(System.out::println);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		//Arbitory Object
		
		List.of("Karan","Mahesh","Pranav","Abhishek")
		.stream()
		.map(String::length)
		.forEach(System.out::println);
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		
		
		
		
		
		
		
	}

}

class show
{
	public static boolean test(int i)
	{
		return i%2==0 && i>=15;
	}
	
	public  boolean best(int j)
	{
		return j%2==0 || j>=15;
	}
	
}
