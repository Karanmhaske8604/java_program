package java_home.Collection;

import java.util.ArrayList;

public class List_four {

	public static void main(String[] args) {
		
		ArrayList<String> arr=new ArrayList<String>(100);//we can assign value for array
		
		arr.add("Mango");
		arr.add("Berry");
		arr.add("Jackfruit");
		arr.add("cherry");
		arr.add("Orange");
		
		//System.out.println(arr.get(6));//array have 100 size but we can't access array beyond the actual size
		System.out.println(arr.get(3));
		System.out.println(arr.getFirst());
		System.out.println(arr.getLast());
		System.out.println(arr.remove("Jackfruit"));
		System.out.println(arr);
		System.out.println(arr.isEmpty());
	}

}
