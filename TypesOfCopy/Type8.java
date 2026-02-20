package java_home.TypesOfCopy;

public class Type8 {

	public static void main(String[] args) {
		
		Address1 adr=new Address1("India","Maharashtra");
		
		Person1 p1=new Person1("Sai",22,adr);
		
		Person1 p2=new Person1(p1);
		
				
		p1.name="Sakshi";
		
		
		System.out.println(p1);
		System.out.println();
		System.out.println(p2);
		
		
		

	}

}
class Person1
{
	String name;
	int age;
	
	Address1 address;
	Person1 p2;
	
	public Person1(String name,int age,Address1 adr)
	{
		this.name=name;
		this.age=age;
		this.address=adr;
	}
	public Person1(Person1 p)
	{
		this.name=p.name;
		this.age=p.age;
		this.address=new Address1("America","Texses");
	}
	
	public String toString()
	{
		System.out.println(address);
		return "name "+name+" age "+age;
		
	}
}
class Address1
{
    String country;
    String state;
    
    public Address1(String country,String state)
    {
    	this.country=country;
    	this.state=state;
    }
    
    public String toString()
    {
    	return "Address\n Country: "+country+" \nState : "+state;
    }
    
    

}




