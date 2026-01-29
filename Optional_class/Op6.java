package java_home.Optional_class;

import java.util.List;
import java.util.Optional;

public class Op6 {

	public static void main(String[] args) {
		
		Optional<Integer> op=List.of(12,45,85,19,22,36,48)
				.stream()
				.min((i,j)->(Integer.compare(i,j)));
		System.out.println(op.get());
		
		Optional<Integer> opl=List.of(12,45,85,19,22,36,48)
				.stream()
				.min((i,j)->(Integer.compare(j,i)));
		System.out.println(opl.get());
		
		

	}

}
