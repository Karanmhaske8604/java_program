package java_home.Stream_API.Assignments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Assignment3 {

	public static void main(String[] args) {
		// [10,13,17,20] print missing elements
		
		List<Integer> list=Arrays.asList(10,12,17,20);
		
		IntStream.rangeClosed(10,20)
		.forEach((i)->{
			if(!list.contains(i)) 
			{
			System.out.println(i);
			}
	});
  }
}
