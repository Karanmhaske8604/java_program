package java_home.Oops;

public class MethodOverriding {

	public static void main(String[] args) {
		Earth e=new Earth(8);
		System.out.println(e.name);
		e.display();
		System.out.println(e.sum(25,56));
	}

}
 
class Solar
{
  public void display()
  {
	  
	 System.out.println("I have the Planet..");
  }
  
  public int sum(int a,int b)
  {
	  return a+b;
  }
  
}

class Earth extends Solar
{
	String name="Solar";
	public void display()
	{
		System.out.println("Im blue");
	}
	
	public int sum(int a,int b)
	{
		return a*b;
	}
	
	public Earth(int a)
	{
		System.out.println("No. planets in solar "+a);
	}
	
}
