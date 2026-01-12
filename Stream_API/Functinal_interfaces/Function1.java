package java_home.Stream_API.Functinal_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

	      Function<Integer, Integer> squared = (value) ->value*value;  

	      List<Integer> squaredNumbers =  numbers.stream().map(squared).toList();

	      System.out.println(squaredNumbers);
	   }
}
