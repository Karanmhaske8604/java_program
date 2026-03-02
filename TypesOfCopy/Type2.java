package java_home.TypesOfCopy;

public class Type2 {

	public static void main(String[] args) throws CloneNotSupportedException 

	{
		//Shallow Copy =>No Changes updated in object copies
		//by .clone()
		
		City ct=new City();
		ct.pincode=413702;
		ct.Name="Ahilyanagar";
		
	    City ct2=(City)ct.clone();
	    
	    ct2.pincode=412586;
	    
	    System.out.println("Object of City 1 "+ct.pincode);
	    System.out.println("Object of City 2 "+ct2.pincode);
	    
	    System.out.println(ct==ct2);//Diff. Memory References
	}

}

class City implements Cloneable
{
	long pincode;
	String Name;
	
	public City()
	{
		System.out.println("Hello"); 
	}
	
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}


