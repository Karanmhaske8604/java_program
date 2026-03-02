package java_home.StreamOperations;

import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperator1 {

	public static void main(String[] args) {
	
		BinaryOperator bo=
		  BinaryOperator.maxBy((i,h)->{
			Double g=(Double)i;
			Double j=(Double)h;
			return Double.compare(g,j);});
		System.out.println(bo.apply(25.0,87.2));
		
		System.out.println("************************************************");
		
		BinaryOperator bi=
				BinaryOperator.minBy((i,h)->{
					Double g=(Double)i;
					Double j=(Double)h;
					return Double.compare(g,j);});
				System.out.println(bi.apply(45.0,87.2));
	
				System.out.println("***********************************");
				
				
	}

}
