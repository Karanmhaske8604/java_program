package java_home.Collection;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		//This is Generic type
		ArrayList a=new ArrayList();
		
		a.add("A");
		a.add("B");
		a.add("C");
		a.add("D");
		a.add(20);
		a.add(2, 35.6);
		
		System.out.println("Size after addition :"+a.size());
		System.out.println("ArrayList Elements:"+a);
		
		a.remove(1);//by Index
		a.remove("C");//by Object
		
		System.out.println("ArrayList after removing elements:"+a);
		
		System.out.println("Elements at index 3 :"+a.get(3));
		System.out.println("Position of 'D':"+a.indexOf("D"));
		
		a.set(2,"X");//Modify element
		
		System.out.println("ArrayList after modification:"+a);

	}

}
