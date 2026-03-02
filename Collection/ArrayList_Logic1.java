package java_home.Collection;
import java.util.*;

public class ArrayList_Logic1 {

	public static void main(String[] args) {
		
		List<String>list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Abhi");
		list.add("Keshav");
		list.add("Karan");
		
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
			
		}
		
		System.out.println(list.contains("Keshav"));//return boolean
		
		
		
		
		

	}

}
