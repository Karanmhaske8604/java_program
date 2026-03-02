package java_home.Oops;
 /*In Overriding the access modifier is can change in child class.Provided that is Same or less Secure than the parent class. 
   private ****
   default ***
   protected**
   public *
  */
public class AccessModifier {
	public static void main(String [] args) {
		Pattern p=new Pattern();
		p.Stay();
		
		
		Pattern c= new Chilled();
		c.Stay();
		c.Display();
	}

}

class Pattern
{
	protected String name="Mhaske";
	
	private void Show()
	{
		System.out.println("Karan "+name);
		System.out.println("Private method can not be overridden");
	}
	
	 void Stay()
	{
	    Show();
	    System.out.println("Default Access Modifier");
	}
	 
	protected void Display()
	{
		//return 10;
		System.out.println("Protected Access Modifier");
	}
	//public is less secure than among them all
}

class Chilled extends Pattern
{
   void Show()
   {
	  System.out.println("Swapnil "+name);
   }
   
   protected void Stay()
   {
	   Show();
	   System.out.println("Override the Defult Access modifier and aslo change its access modifier ");
   }
  
   public void Display()
  {
	 // return 1000;
	  System.out.println("Overrride the protected method and change its access modifier");
  }
     
}
