package java_oops;

public class Third {

	public static void main(String[] args) {
		// Hierarchical inheritence  in which more than one child class inherit from parent class.
		 
		Child1 c1=new Child1();
		System.out.println(c1.surname);
		c1.show();
		
		Child2 c2=new Child2();
		System.out.println(c2.surname);
		c2.show();
		
		Grandchild g=new Grandchild();
		System.out.println(g.surname);
		g.show();
		g.add(4560, 611640);
		
		
	}
}

class Parent
{
	String surname="Mhaske";
	public void show()
	{
		int x=10;
		int y=20;
		System.out.println(x+y +"is the answer");
	}
}
  class Child1 extends Parent
  {
	  //child1 inherit Parent.
	  public void add(int a,int b)
	  {
		  System.out.println(a+b);
	  }
	  
  }
  
  class Child2 extends Parent
  {
	  //child2 also inherit Parent
	  
  }
  
  class Grandchild extends Child1
  {
	  //Grand child inherit Child1 and Parent too.
  }