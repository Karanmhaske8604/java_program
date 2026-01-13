package java_home.StreamOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Operation3 {

	public static void main(String[] args) {
	
		List<String> list=new ArrayList<String>();
		
		list.add("karan");
		list.add("keshav");
		list.add("Tanvi");
		list.add("gayatri");
		
		System.out.println(list);
		
		Function<String,Integer> fun=(t)->{ return t.length();};
		Consumer<Integer> cons=(i)->{System.out.println(i);};
		
		list.stream().map(fun).forEach(cons);
		
		System.out.println("#####################################");
		
		Function<String,StringBuffer> fun2=(d)->{return new StringBuffer(d).reverse();};
		Consumer<StringBuffer> con2=(j)->{System.out.println(j); };
		
		list.stream().map(fun2).forEach(con2);
		
		}
}