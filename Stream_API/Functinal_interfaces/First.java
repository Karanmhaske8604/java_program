package java_home.Stream_API.Functinal_interfaces;

import java.util.function.Predicate;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		System.out.println(d.test(5));
		
		
	 Predicate <String> pred=(i)->{
		return i.length()>10;
	};
	System.out.println(pred.test("jhviwmn c"));
	}

}


class Demo implements Predicate<Integer>
{

	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t>10;
	}
	
}
