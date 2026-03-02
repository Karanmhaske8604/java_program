package java_home.Stream_API.Functinal_interfaces;

import java.util.function.Predicate;

public class Predicate5 {

	public static void main(String[] args) {
		
		Predicate <Integer> pd1=(i)->{return i%2==0;};
		Predicate <Integer> pd2=(i)->{return i>100;};
		
		Predicate <Integer> p3=pd1.or(pd2);//.or is Logical OR
	    System.out.println(p3.test(43));
	    
	    
	    Predicate <String> p4=Predicate.isEqual("Hello");
	    System.out.println(p4.test("Hello"));
	    
		Predicate <Integer> p5=Predicate.not((i)->{return i>10; });//.not changes output in opposite.Stored in Predicate.
		System.out.println(p5.test(1));
	}

}
