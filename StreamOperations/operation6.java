package java_home.StreamOperations;

import java.util.List;

public class operation6 {

	public static void main(String[] args) {
		
		System.out.println(List.of(5,45,85,21)
		.stream()
		.max((i,j)->{return Integer.compare(i,j);}).get());
		//max() provide maximum no.according to the comparator
	System.out.println("/////////////////////////////");
		
		List.of(5,45,85,21)
		.stream()
		.sorted((i,j)->{return Integer.compare(j,i);}).forEach((i)->{System.out.println(i);});
		
	}

}
