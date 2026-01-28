package java_home.StreamOperations;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assign3 {

	public static void main(String[] args) {
		// find frequency of each character from strings.
		Map<String,Integer> mp=new HashMap<String,Integer>();
		
		Map<String,List<String>>list1=List.of("K","A","R","A","K")
				.stream()
				.collect(Collectors.groupingBy((i)->(i)));
				//System.out.println(list1);
				
				for(Map.Entry<String,List<String>> m:list1.entrySet())
				{
				  System.out.println(m.getKey()+" "+m.getValue().size()+" ");
				mp.put(m.getKey(), m.getValue().size());
				}
				
				System.out.println(list1);
				System.out.println(mp);
				
	}

}
