package java_home.StreamOperations;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Operation20 {

	public static void main(String[] args) {
		// Collect toSet & groupingBy 
		
		Set<Integer>list=List.of(121,155,03,12,14,15,12,19,19)
		.stream()
		.collect(Collectors.toSet());
		System.out.println(list);
		
		Map<String,List<String>>list1=List.of("ABBA","ABBA","dada","dada","madha")
				.stream()
				.collect(Collectors.groupingBy((i)->(i)));
				System.out.println(list1);
	}

}
