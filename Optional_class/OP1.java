package java_home.Optional_class;

import java.util.Optional;

public class OP1 {

	public static void main(String[] args) {
		
		/*Optional class create by two ways
		 * A) .of() =>NULL ->No
		 * B) .ofNullable() =>NULL ->YES
		 * 	  .get()=>instance method returns =T | NoSuchElementException
		 *  without .get()A)optional[Null] B)optional.empty
		 */
		
		Optional<String> op=Optional.of("null");
		System.out.println(op.get());
		
		
		Optional<String> op1=Optional.ofNullable(null);
		System.out.println(op1);

	}

}
