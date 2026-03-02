package java_home.StreamOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Operation19 {

	public static void main(String[] args) {
		// Collect =>groupingBy->
		//Creates a Map where keys are the criteria and values are lists of items matching that criteria.
		
		Map<Character,List<String>>list2=List.of("Abhishek","salman","Ajay","anoj")
				.stream()
				.collect(Collectors.groupingBy((i)->{return i.charAt(0);}));
				System.out.println(list2);
		
		
	
	}
}
