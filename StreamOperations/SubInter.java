package java_home.StreamOperations;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class SubInter {

	public static void main(String[] args) {
		// BiFunction And Binary Operator InterFace
		
		 BiFunction<String,String[],Integer> bi=(t,u)->{return t.length() + u.length;};
		 	//takes two diff.param convert it into third diff.param
		 System.out.println(bi.apply("karan", new String[]{"args","better"}));
		 
		 System.out.println("***********************************");
		 
		 BinaryOperator<Integer> bo=(i,j)->{return i-j;};
		 //takes two same param. convert it into third param of samme type
		 //binary operation perform well.
		 System.out.println(bo.apply(52,2));
	}
 
}
