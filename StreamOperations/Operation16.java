package java_home.StreamOperations;

import java.util.Arrays;
import java.util.List;

public class Operation16 {

	public static void main(String[] args) {
		// flatMap:-Flatten this nested list into single list
		
		List<String> list1=Arrays.asList("java","Spring","collection");
		List<String> list2=Arrays.asList("python","Django","tuple");
		
		List<List<String>> list3=Arrays.asList(list1,list2);
		System.out.println(list3);
		
		List<String> list4=Arrays.asList("java","Spring","collection");
		List<String> list5=Arrays.asList("python","Django","tuple");
		
		List<List<String>> list6=Arrays.asList(list1,list2);
		System.out.println(list6);
		
		List<List<List<String>>> list7=Arrays.asList(list3,list6);
		System.out.println(list7);
		
	     list7.stream()
		.flatMap((i)->{return i.stream();})
		.peek((i)->{System.out.println(i+"--");})
		.flatMap((i)->{return i.stream();})
		.forEach(System.out::println);
		
	}

}
