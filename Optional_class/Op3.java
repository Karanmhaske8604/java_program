package java_home.Optional_class;

import java.util.Optional;

public class Op3 {

	public static void main(String[] args) {
		Optional<String> op=Optional.ofNullable("Optioanl");
		
		op.ifPresent((i)->{System.out.println(i.length());});
		//If value is present then perform op | optional.empty
		
		op.ifPresentOrElse((i)->{System.out.println(i.charAt(0));}, ()->{System.out.println("No value is present");	});

	}

}
