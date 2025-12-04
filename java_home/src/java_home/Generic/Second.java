package java_home.Generic;

public class Second {

	public static void main(String[] args) {
	 
		converter<String,Integer>c=new conv_imp();
	 
		System.out.println(c.convert("KAranmHaske"));

	}

}

interface converter<T,R>
{
	R convert(T t1);
}

class conv_imp implements converter<String,Integer>
{
 public Integer convert(String t1)
 {
	 return t1.length();
 }
}
