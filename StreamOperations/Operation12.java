package java_home.StreamOperations;

import java.util.List;
import java.util.function.BinaryOperator;

public class Operation12 {

	public static void main(String[] args) {
		//  reduce type 1: Binanary Operator 
		//Addition of elements of list.
		
		BinaryOperator<Integer> bi=(i,j)->{return i+j;};
		
		//System.out.println(bi.apply(12,35));
	
		int sum=List.of(5,6,2,4,1)
				.stream()
				.reduce(0, bi);
		System.out.println(sum);
	}

}
