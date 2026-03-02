package java_home.Stream_API.Functinal_interfaces;

import java.util.function.Function;

public class Function3 {

	public static void main(String[] args) {
		Function<String,Integer> fun=(i)->{return i.length();};
		
		//System.out.println(fun.apply("KARAN"));
		
		Function<Integer,Double>fun2=(i)->{return i*10.0;};
		//System.out.println(fun2.apply(12));
		
		Function<String,Double> fun3=fun.andThen(fun2);//.andThen executes function 1 and then function 2.
		System.out.println(fun3.apply("Congratulations"));
	

	}

}
