package java_home.StreamOperations;

import java.util.stream.IntStream;

public class BinaryPro {

	public static void main(String[] args) {
		// Advanced-Level Question :-3 Ways to solve
		//1st 100 No. sum without loop
		
		IntStream.range(0, 100)
		.forEach((i)->{System.out.println(i);});
		
		System.out.println("*********************************");
		
		Integer sum1=IntStream.rangeClosed(0, 10)
		.reduce(0,(i,j)->{return i+j;});
		
		System.out.println(sum1);
		System.out.println("//////////////////////////////////");
		
		Integer sum2=IntStream.rangeClosed(0,50)
				.reduce(0,demo::sum);
		
		System.out.println(sum2);
		

	}
}

class demo
{
  public static int sum(int i,int j)
  {
	return i+j;
	  
  }
}