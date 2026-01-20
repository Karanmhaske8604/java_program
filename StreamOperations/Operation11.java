package java_home.StreamOperations;

import java.util.List;

public class Operation11 {

	public static void main(String[] args) {
		//Count() Method
		
		Long NUM=List.of(23,53,2344,22,44,345)
		.stream()
		.count();
		
		System.out.println(NUM);

	}

}
