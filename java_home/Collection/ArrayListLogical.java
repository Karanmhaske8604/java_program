package java_home.Collection;
import java.util.*;


public class ArrayListLogical {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(51);l.add(52);l.add(70);l.add(78);
		
		int num=l.getFirst();
		for(int i=l.getFirst();i<=l.getLast();i++)
		{
		     if(! l.contains(num)) //(l.contains(num)==false)
		     {
		    	 System.out.println(num);
		     }
		     num++;
		}
	}

}
