package java_home.StreamOperations;

import java.util.List;
import java.util.function.Predicate;

public class Operations {

	public static void main(String[] args) {
		//There are two Operation-i)Intermideatary Opertions ii)Terminal Opertions.
	List<Integer>list=List.of(11,23,42,12,15,5,7,3);
	
	Predicate<Integer> pred=(j)->{return j>10;};
		
	list.stream().filter(pred).forEach((i)->{System.out.println(i*10);});  //atleast one terminal method for invoke Stream Pipeline.
	 
	
	}

}
