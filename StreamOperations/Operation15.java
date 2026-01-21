package java_home.StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Operation15 {

	public static void main(String[] args) {
		/* collect() method.it has Collectors iterative class.
		*it convert stream into a collection like list,set,map,String.
	    */
		 
		List<Integer>list=List.of(10,12,14,16)
		.stream()
		.map((i)->{return i*5;})
		.collect(Collectors.toList());
		
		System.err.println(list);
	
	}
}
