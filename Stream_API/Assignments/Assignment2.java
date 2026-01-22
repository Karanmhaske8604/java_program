package java_home.Stream_API.Assignments;

import java.util.Arrays;
import java.util.List;

public class Assignment2 {

	public static void main(String[] args) {
		
		
		List<String> list1=Arrays.asList("karan","nanda");
		List<String> list2=Arrays.asList("Omkar","sama");
		
		List<List<String>> list3=Arrays.asList(list1,list2);
		System.out.println(list3);
		
		List<String> list4=Arrays.asList("karan","nanda");
		List<String> list5=Arrays.asList("Omkar","sama");
		
		List<List<String>> list6=Arrays.asList(list1,list2);
		System.out.println(list6);
		
		List<List<List<String>>>list7=Arrays.asList(list3,list6);
		System.out.println(list7);
		
		
		
		
		int sum=list7.stream()
				.flatMap((i)->{return i.stream();})
				.flatMap((i)->{return i.stream();})
				.map((i)->{return i.length();})
				.reduce(0,(i,j)->{return i+j;});
		
		System.out.println(sum);
		
		
		
	
	}
}
