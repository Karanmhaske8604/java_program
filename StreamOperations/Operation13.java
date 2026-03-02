package java_home.StreamOperations;

import java.util.List;
import java.util.function.BinaryOperator;

public class Operation13 {

	public static void main(String[] args) {
		// reduce type 1 : Binary Operator
		
		BinaryOperator<Integer> bio=(i,j)->{return i*j;};
		//0 - Accumulator in Multiplication
	int mul=List.of(5,15,25,35,45)
		.stream()
		.reduce(1,bio);//pass accumulator  
	System.out.println(mul);	
	
	BinaryOperator<String> biOp=(i,j)->{return i+j;};
	String conct=List.of("10","10","10")
			.stream()
			.reduce("",(i,j)->{return i.concat(j)+"####";});
	System.out.println(conct);
	
	
	

	}

}
