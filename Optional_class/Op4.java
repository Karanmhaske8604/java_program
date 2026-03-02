package java_home.Optional_class;

import java.util.Optional;

public class Op4 {

	public static void main(String[] args) {
	    
		Optional<String> op=Optional.ofNullable("null");
		
		System.out.println(op.or(()->(Optional.of("No Values"))));
		
		System.out.println(op.orElse("null value"));
		
		System.out.println(op.orElseGet(()->("nothing")));

		System.out.println(op.orElseThrow());
	}

}
