package java_home.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hashmap_demo {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put(new String("ABC"), 1);
		map.put(Supplier.getvalue("ABC"), 2);
		System.out.println(map.size());
		System.out.println(map);
	}
}
class Supplier
{	
	public  static  String getvalue(String str)
	{
		return new String(str);
	}
}
	