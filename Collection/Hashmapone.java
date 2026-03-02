package java_home.Collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmapone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(null,"one null key possible");
		map.put(1, "null");
		map.put(2,"aall");
		map.put(3,"String");
		map.put(4,"Value");
		map.put(5, "null");
		
		System.out.println(map);
		
	}

}
