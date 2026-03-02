package java_home.Collection;

import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(25);
		list.add(45);
		list.add(65);
		list.add(95);
		
		System.out.println("Origianl List"+list);
		System.out.println(list.get(2));
		System.out.println(list.set(1, 105));
		System.out.println("After setting element:"+list);
		System.out.println(list.removeAll(list));
		System.out.println("After removing element:"+list);
		
		
		
		

	}

}
