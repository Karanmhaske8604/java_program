package java_home.StreamOperations.Method_Reference;

import java.util.List;
import java.util.stream.IntStream;

public class ReferAssig {

	

	public static void main(String[] args) {
		// print 1-100 without for loop
		
		int num=IntStream.rangeClosed(0,100)
				.reduce(0,(i,j)->{return i+j;});
		
		System.out.println(num);
				
	}

}
