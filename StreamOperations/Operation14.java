package java_home.StreamOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Operation14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(List.of(10,20,30,40)
		.stream()
		.noneMatch((i)->{return i>50;}));
		
		
		System.out.println(List.of(2,5,6,7,3,9)
		.stream()
		.map((i)->{ return i*2;})
		.collect(Collectors.toList()));
	}

}
