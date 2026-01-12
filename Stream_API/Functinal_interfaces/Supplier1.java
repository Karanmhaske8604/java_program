package java_home.Stream_API.Functinal_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {
		 Supplier<Integer> supplier = () -> (int)(Math.random() * 10);

	      List<Integer> randomNumbers = new ArrayList<>();

	      // generate 10 random numbers
	      for(int i = 0; i< 10; i++) {
	         randomNumbers.add(supplier.get());
	      }
	      System.out.println(randomNumbers);
	   }

	}

