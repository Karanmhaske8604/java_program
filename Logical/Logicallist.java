package java_home.Logical;
import java.util.ArrayList;

public class Logicallist {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		
		arr.add(111);arr.add(2341);arr.add(1245);arr.add(4221);arr.add(null);arr.add(641);arr.add(69);arr.add(100);
		System.out.println(arr);
		
//		for(int i=0;i<arr.size();i++)
//		{
//			if(arr.get(i)!=null)
//			{
//				if(arr.get(i).toString().charAt(0)=='1')
//				{
//					System.out.println(arr.get(i));
//					arr2.add(arr.get(i));
//					
//				}
//			}
//		}
		for(int i=0;i<arr.size();i++)
		{
			if(arr.get(i) !=null)
			{
				if(arr.get(i).toString().startsWith("1")==true)
				{
					
				 System.out.println((arr.get(i)));
				 arr2.add(arr.get(i));
				}
			}
		}
	}

}
