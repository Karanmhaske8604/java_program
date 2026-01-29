package java_home.Optional_class;

import java.util.Optional;

public class Op5 {

	public static void main(String[] args) {
		// Optional with functional op.
		
		Optional<Integer> op=Optional.ofNullable(50);
		
		System.out.println(op.flatMap((i)->{return Optional.of(i*8);}).get());
		
		System.out.println(op.map((i)->(Optional.of(i+2)).get()));
	}

}
