package java_home.StreamOperations;

import java.util.List;

public class Operation5 {

	public static void main(String[] args) {
		//Terminal Operations.
		System.out.println(List.of(45,85,96,23)
		.stream().allMatch((i)->{return i>50;}));
		
		System.out.println(List.of(45,85,96,23)
				.stream().anyMatch((i)->{return i>50;}));
	}

}
