package java_home.Stream_API.Functinal_interfaces;

import java.util.function.Predicate;

public class Predicate2 {

	public static void main(String[] args) {
		Predicate <Integer> Prd=(i)->{
			return i%2==0;
		};
		System.out.println(Prd.test(80));
	}

}
