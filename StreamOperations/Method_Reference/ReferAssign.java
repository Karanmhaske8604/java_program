package java_home.StreamOperations.Method_Reference;

import java.util.List;

public class ReferAssign {

	public static void main(String[] args) {
		// find the square of given strings length by Method Ref.
		
		List.of("Mhaske","Karan","Vasudev")
		.stream()
		.map(String::length)
		.map(ReferAssign::square)
		.forEach(System.out::println);
		
	}
	public static int square(int j)
	{
		return j*j;
	}

}
