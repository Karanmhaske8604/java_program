package java_home.Iterator;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class ListItr {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(84);list.add(24);list.add(98);list.add(63);list.add(74);list.add(984);
		System.out.println(list);
		
		ListIterator<Integer>itr=list.listIterator();
		
		while(itr.hasNext())
		{
			if(itr.next()==74)
			{
				itr.add(75);
			}
		}
		
		while(itr.hasPrevious())
		{
		System.out.println(itr.previous());
		}
		
//		for(int i:list)
//		{
//			if(i==75)
//			{
//				list.remove(Integer.valueOf(75));
//			}
//		}
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)==74)
			{
				list.remove(i);
			}
				
		System.out.println(list.get(i));
		}
		System.out.println(list);
		

	}

}
