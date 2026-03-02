package java_home.StreamOperations.Method_Reference;

import java.util.List;

public class Ref6 {

	public static void main(String[] args) {
		//Constructor Ref.
		
		List.of("Gayatri","Pradnya","Srushti")
		.stream()
		.map(StringBuffer::new)
		.map(StringBuffer::reverse)
		.forEach(System.out::println);

		
	}
}

