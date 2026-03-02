package java_home.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEnhanced {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(51);l.add(52);l.add(70);l.add(78);l.add(59);l.add(50);l.add(69);
		
		List<Integer> l2=new ArrayList<Integer>();
		for(int i:l)
		{
		//System.out.println(i);
		//System.out.println("*");
			
			if(i%2==0)
			{
				l2.add(i);
				//l.remove(Integer.valueOf(i)); //Concurrent Modififcation
			}
			System.out.println(l);
			l2.removeAll(l2);
			System.out.println(l2);
		}
		

	}

}
