package java_home.Optional_class;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Op7 {

	public static void main(String[] args) {
		//Optional With collection
		
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(45);arr.add(25);arr.add(20);
		
		Optional<Integer> op=arr.stream()
				.reduce((i,k)->(i+k));
		
		op.ifPresentOrElse(System.out::println, ()->{System.out.println("Empty list");});

	}

}
