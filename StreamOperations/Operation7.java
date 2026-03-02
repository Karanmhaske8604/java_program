package java_home.StreamOperations;

import java.util.List;

public class Operation7 {

	public static void main(String[] args) {
	
		List.of(11,11,34,34,3,22,3,11,43,29)
		.stream()
		.peek((i)->{System.out.println(i+"KARA");;}) //Returns a stream consisting of the elements of this stream, truncated
		.distinct()//return unique elements only from stream.
		.forEach((i)->{System.out.println(i);});
	}

}
