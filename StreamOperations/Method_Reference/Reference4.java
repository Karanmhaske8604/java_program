package java_home.StreamOperations.Method_Reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Reference4 {

	public static void main(String[] args) {
		// 4)Constructor Ref.
		
		Supplier<People> sup=People::new;            //not work at ref.time
		sup.get();                                   //Constructor called at runtime
		
		Function<Integer,People> fun=People::new;     //sign must be same as constructor
		fun.apply(5);
		
	}
}

class People
{
   public People()
   {
	System.out.println("Default constructor called..");
   }
   
   public People(int i)
   {
	   System.out.println("Parameterized costructor.."+i);
   }
}



