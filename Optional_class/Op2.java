package java_home.Optional_class;

import java.util.Optional;

public class Op2 {

	public static void main(String[] args) {
		// Optional Methods
		
		Optional<String> op=Optional.empty();
		System.out.println(op);//=>optional.empty
		
		Optional<String> opl=Optional.ofNullable("null");
		
		System.out.println(opl.isEmpty());//value present=>false | true
		System.out.println(opl.isPresent());//value present=> true | false
		
		

	}

}
