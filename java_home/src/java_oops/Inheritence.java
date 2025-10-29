package java_oops;

public class Inheritence {

	public static void main(String[] args) {
		
		A a=new A();
		
		
		System.out.println(a.access);
		a.method();
		
		B b=new B();
		System.out.println(b.access);//B sub class inherit properties of A parent class.
		b.method();
		b.display();                 //sub-class has access of own property with A class properties i.e known as Extensibility inheritence.

		C c=new C();
		System.out.println(c.access);
		c.method();
		c.display();
		c.show();
		
	}
}

class A
{
 String access="hello";
 
 public void method()
 {
	 System.out.println("welcome on board");
  }
}

class B extends A
{
	//B sub class inherit properties of A parent class
	
	public void display()
	{
		System.out.println("lets get start");
	}
	
}
 class C extends B
 {
	 //C sub class extends A parent class
	 public void show()
	 {
		 System.out.println("lets begin");
	 }
	 
 }
