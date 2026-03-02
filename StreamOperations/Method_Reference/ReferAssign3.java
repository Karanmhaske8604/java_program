package java_home.StreamOperations.Method_Reference;

import java.util.List;

public class ReferAssign3 {

	public static void main(String[] args) {
		//Reverse the List of String by Method Ref.
		
		List.of("Hello","Raghav","Bye","Seeta")
		.stream()
		.map(StringBuffer::new)      //Constructor Ref.
		.map(StringBuffer::reverse)   //Arbitary type
		.map(StringBuffer::toString)	//Arbitary type
		.forEach(System.out::println);

	}

}
