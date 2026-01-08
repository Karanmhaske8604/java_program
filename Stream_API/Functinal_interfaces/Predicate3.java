package java_home.Stream_API.Functinal_interfaces;

import java.util.function.Predicate;

public class Predicate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Predicate <String> Prds=(s)->{
			StringBuffer sb=new StringBuffer(s);
			String s1=sb.reverse().toString();
			
			return s.equals(s1);
        };
        System.out.println(Prds.test("hih"));
	}

}
