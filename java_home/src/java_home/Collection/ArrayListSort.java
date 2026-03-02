package java_home.Collection;
import java.util.*;
public class ArrayListSort {

	public static void main(String[] args) {
		
		ArrayList <String> s=new ArrayList<String>();
		
		s.add("Apple");s.add("Mango");s.add("Rasberry");s.add("Lichi");s.add("Banana");s.add("Orange");
		System.out.println("ArrayList before Sorting:"+s);
		s.sort(null);  //Provided by ArrayList
		Collections.sort(s);  //Provided by JCF to sort objects of any collection.
		System.out.println("ArrayList after Sorting:"+s);
		
		ArrayList <Integer> a=new ArrayList<Integer>();
		
		a.add(1);a.add(2);a.add(3);a.add(4);a.add(5);a.add(6);a.add(7);
		System.out.println("ArrayList before Sorting:"+a);
		Collections.sort(a,Collections.reverseOrder());//used as second argument.if obj belongs to user defined class then sort method takes another arg
		System.out.println("ArrayList after Sorting ReverseOrder:"+a);
		
		
		
		
	}

}
