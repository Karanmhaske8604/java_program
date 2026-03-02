package java_home.StreamOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class operation18 {

	public static void main(String[] args) {
		// Collect method for toList(),toMap(),toSet().
		
		List<String>list1=List.of("Abhishek","salman","Ajay","Manoj")
		.stream()
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		System.out.println(list1);
		
		Map<Integer,String>list2=List.of("Abhishek","salman","Ajay","anoj")//No Dup.key in map Allowed.
		.stream()
		.collect(Collectors.toMap(String::length, String::new,(first,second)->{return first;}));//Binary Merge function.
		System.out.println(list2);
		
		Set<String>list3=List.of("Abhishek","salman","Ajay","Ajay")
				.stream()
				.map(String::toLowerCase)
				.collect(Collectors.toSet());
				System.out.println(list3);
		
		
	}

}
