package java_home.Oops;

public class Overloading {
//Static polymorphism 
	public static void main(String[] args) {
		Henry h=new Henry();
		h.show();
		h.show(45,60);
		h.show(5);
		h.show("hello");
	}

}

class Henry
{
	public static void show()
	{
		System.out.println("hey");
	}
	
	public  static void show(int a,int b)
	{
	   System.out.println(a+b);
	}
	
	public final  void show(int i)
	{
		System.out.println("This is final method");
	}
	
	public final void show(String s) 
	{
		System.out.println("This is second final method");
	}
}

