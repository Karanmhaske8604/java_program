package java_home.StreamOperations.Method_Reference;

import java.util.List;



public class Reference3 {

	public static void main(String[] args) {
		// 3)Method Ref.of Particular Object and Arbitary Type.
		
	   //Using Particular Object
		
		//String s="Hello";
		StringBuffer s=new StringBuffer("Bye");
		List.of(" Karan"," shyam")
		.stream()
		.map(s::append)//concat for String
		.forEach(System.out::println);
		
		System.out.println("//////////////////////////////");
		//Using Arbitary Type
		
		List.of("mhaske","Karan","vasudev")
		.stream()
		.map(String::toUpperCase)
		.forEach(System.out::println);
	}

}
