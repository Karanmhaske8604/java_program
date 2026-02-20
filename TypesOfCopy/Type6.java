package java_home.TypesOfCopy;

public class Type6 {

	public static void main(String[] args) {
		// Deep copy Constructor
		
		Citty ct=new Citty();
		
		
		Person p1=new Person();
		p1.Age=21;
		p1.Name="Karan";
		p1.city=ct;
		
		p1.city.state="Mumbai";
		p1.city.country="India";
		
		Person p2=new Person(p1);
		p2.Age=20;
		p2.Name="Gayatri";
		p2.city.state="Texas";
		p2.city.country="America";
		
		System.out.println("Age:"+p1.Age+" Name:"+p1.Name);
		System.out.println("Person 1 "+p1.city.state+" "+p1.city.country);
		System.out.println();
		System.out.println("Age:"+p2.Age+" Name:"+p2.Name);
		System.out.println("Person 2 "+p2.city.state+" "+p2.city.country);
		
		
	}

}

class Person
{
	String Name;
	int Age;
	
	Citty city;
	
	public Person()
	{
		
	}
	
	public Person(Person person)//Copy Constructor
	{
		this.Age=Age;
		this.Name=Name;
		
		this.city=new Citty();//New Object of City
		this.city.country=person.city.country;//Ref. attached to the person
		this.city.state=person.city.state;
		
	}
	
	
	
}

class Citty
{
	String country;
	String state;
}

