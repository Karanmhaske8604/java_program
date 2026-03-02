package java_home.Iterator;

import java.util.Iterator;
import java.util.Stack;

public class ItrDEmo {

	public static void main(String[] args) {
Stack<Integer> coll=new Stack<Integer>();
		
		
		coll.add(23);
		coll.add(45);
		coll.add(333);
		coll.add(111);
		   
		Iterator<Integer> itr=coll.iterator();
		    while(itr.hasNext())
		    {
		    	System.out.println(itr.next());
		    }
		    
		    System.out.println(coll.pop());
		    System.out.println(coll);

	}

}
