package java_home;

public class Usefinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c=new Company();
		c.id=101;
		c.name="BMw";
				
		Company d=new Company();
		d.id=201;
		d.name="honda";
		//d.state="odisha"; //JVM compiler not allow it.because we have finalize the value by using final keyword in class
		
	      System.out.println(c.id);
		  System.out.println(c.name);
		  //System.out.println(c.state);
		c.demo();
		  
		  System.out.println(d.id);
		  System.out.println(d.name);
		  //System.out.println(d.state);
		
		d.demo();
		
		

	}

}
class Company
{
 int id;
 String name;
 static final String state="Maharastra";
 
 public static void demo()
 {
	System.out.println("The common state of the cars:"+state);
	System.out.println();
 }
}
