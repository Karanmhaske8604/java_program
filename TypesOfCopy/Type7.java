package java_home.TypesOfCopy;

public class Type7 {

	public static void main(String[] args) {
		
		Addresss ad=new Addresss();
		
		
		America america=new America();
		america.address=ad;
		america.address.location="Shirur";
		
		
		
		America america2=new America(america);
		america2.age=23;
		america2.name="keshav";
		america2.address.location="mumbai";
		
		System.out.println(america.age);
		System.out.println(america.name);
		System.out.println(america.address.location);
		
		System.out.println();
		
		System.out.println(america2.age);
		System.out.println(america2.name);
		System.out.println(america2.address.location);

	}

}

class America
{
	String name="sai";
	int age=21; 
	
	Addresss address;
	
	public America()
	{
		
	}
	
	public America(America america)
	{
		this.address=america.address;
		this.age=america.age;
		this.address=new Addresss();
		this.address.location=address.location;
	}

	
}

class Addresss
{
	String location;
}
