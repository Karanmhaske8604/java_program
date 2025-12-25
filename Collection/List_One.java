package java_home.Collection;

import java.util.ArrayList;
import java.util.List;

public class List_One {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
	//list.add("list");//fixed type can not let String to add in ArrayList.
	list.add(69);
	list.add(70);list.add(58);list.add(59);
	System.out.println(list.isEmpty());
	list.add(3, 71);//index and integer
	list.addLast(99);
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
	list.removeAll(list);
	System.out.println(list);
	}

}
