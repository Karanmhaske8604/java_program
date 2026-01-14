package java_home.StreamOperations;

import java.util.List;

public class Operation4 {

	public static void main(String[] args) {
		//String to Integer.
		List.of("karan","rahul","mahesh","abhishek")
		.stream().map((s)->{return s.length();}).forEach((i)->{System.out.println(i);});
		
		//map converts one obj.to another obj.
		System.out.println("***********************************");
		List.of("TAnvi","Gayatri","Pradnya","payal")
		.stream().map((j)->{return new StringBuffer(j).reverse().toString().toLowerCase();}).forEach((j)->{System.out.println(j);});
		
		
		

	}

}
