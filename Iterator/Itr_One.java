package java_home.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itr_One {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(22);list.add(68);list.add(28);list.add(55);list.add(96);list.add(741);
		
		System.out.println(list);
		
//		for(int i:list)
//		{
//			list.remove(3);
//			System.out.println(i);
//		}
		
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.println(list.get(i));
//			list.remove(3);
//		}
//		System.out.println(list);
		
		Iterator <Integer>itr=list.iterator();
		
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());
		
		while(itr.hasNext())
		{
			Integer value=itr.next(); // Two .next() print Alternate elements
			System.out.println(itr.next());
			if(value !=0 && value ==55){
				itr.remove();
				
			}
			//System.out.println("********");
			//itr.remove();
		}
		System.out.println(list);
	
	}
}
