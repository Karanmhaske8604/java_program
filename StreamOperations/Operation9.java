package java_home.StreamOperations;

import java.util.List;

public class Operation9 {

	public static void main(String[] args) {
		
	// limit() and skip() 
		
		List.of(13,44,222,43,23,43,999,888)
		.stream()
		.limit(5)
		.skip(2)
		.forEach((i)->{System.out.println(i);});
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		// Find Second highest and Third highest from the List.
	
		List.of(13,44,222,43,23,56,222,888,999)
		.stream()
		.sorted() //13,23,43,44,56,222,888,999
		.limit(8)
		.skip(6)
		.forEach((i)->{System.out.println(i);});
		
		System.out.println("*************************************");
		
		List.of(7,12,9,54,33,89,43,15,99)
		.stream()
		.sorted((i,j)->(Integer.compare(j, i)))
		//99,89,54,43,33,15,12,9,7		
		.limit(3)
		.skip(1)
		.forEach((j)->{System.out.println(j);});
	
	}
}
