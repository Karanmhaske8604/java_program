package java_home.Collection;

import java.util.ArrayList;

public class List_Three {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		
		System.out.println("This is generic that does care for data types");
		arr.add(125);
		arr.add("String");
		arr.add('C');
		arr.add(12.5);
		arr.add(1255);
		arr.add(null);
		System.out.println(arr);

	}

}
