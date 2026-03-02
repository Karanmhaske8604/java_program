package java_home.Stream_API.Functinal_interfaces;

import java.util.function.Predicate;

public class Predicate2 {
//check Even / Odd by Predicate.
	public static void main(String[] args) {
		Predicate <Integer> Prd=(i)->{
			return i%2==0;
		};
		System.out.println(Prd.test(80));//.test is abstract method which checks args is true or false. 
	}

}
