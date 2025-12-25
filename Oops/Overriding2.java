package java_home.Oops;

public class Overriding2 {

	public static void main(String[] args) {
		Bala b=new Bala();
		System.out.println(b.name);
		b.display();
		System.out.println(b.play());
		b.hide("St");

	}

}
class Ala
{
 String name="Example of Overriding in static and final method";

	/*
	 *public Ala() 
	 *{ 
	 *  System.out.println("");
	 * }
	 */
 public void display()
 {
	 System.out.println("Hello from A");
 }
 
 public static int play()
 {
	 return 156655;
 }
 
 final public void hide()
 {
	 System.out.println("Its first final method");
 }
}
 

class Bala extends Ala
{
	public void display()  //override and hide display of A.
	{
	super.display(); //invoke A's display
	System.out.println("Hello from B");	
	}
	
	public static int play()
	{
		return 2300;
		//System.out.println("We cannot override the static method. if change its signnature then it will dispaly as new method");
	    //System.out.println("If a subclass declares a static method with the same signature as one in its superclass,it hides the superclass version");	
	   }
	final public void hide(String a)
	{
		System.out.println("final method can not be overriden or hidden");
	}
	
}
