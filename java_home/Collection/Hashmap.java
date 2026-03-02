package java_home.Collection;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		
		  map.put(23, "zyz");
		  map.put(1, "anc");
		  map.put(2, "xyx");
		  map.put(3, "ijk");
		  map.put(1, "abc");
		  
	    System.out.println(map.get(23));
	    System.out.println(map.getOrDefault(23, "default"));
		  
		  System.out.println(map);
	}

}
