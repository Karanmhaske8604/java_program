package java_home.Stream_API.Functinal_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumer2 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(23);
		list1.add(46);
		list1.add(8);
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(11);
		list2.add(15);
		
		List<List<Integer>> list3=new ArrayList<List<Integer>>();
		list3.add(list1);
		list3.add(list2);
		
		
		System.out.println(list3);
		
		Two_d tow=new Two_d();
		tow.accept(list3);
	}

}
class First_List implements Consumer<List<Integer>>
{

	int sum=0;
	@Override
	public void accept(List<Integer> t) {
		for(int i:t)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	public int sum()
	{
		return this.sum;
	}
}

class Two_d implements Consumer<List<List<Integer>>>
{

	@Override
	public void accept(List<List<Integer>> t) {
		List<Integer> list4=new ArrayList<Integer>();
		for(List<Integer> list:t)
		{
			First_List list2=new First_List();
			list2.accept(list);
			
			 list4.add(list2.sum());
			
		}
		System.out.println("final solution:");
		First_List list2=new First_List();
		list2.accept(list4);
		
	}
	
}
		
		

	


