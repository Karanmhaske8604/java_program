package java_home.StreamOperations;

import java.util.Arrays;

public class Assign1 {
	
	public static void main(String[] args) {
		//
	int [] arr= {9,4,5,6,2,10};
	
		Arrays.stream(arr)
			.sorted()
			.limit(5)
			.skip(4)
			.forEach((k)->{System.out.println(k);});
			
	}
}
