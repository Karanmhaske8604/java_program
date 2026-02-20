package java_home.TypesOfCopy;

public class Type5 {

	public static void main(String[] args) {
		// Deep Copy=> Copy Constructor
		
		Forest forest=new Forest();
		//forest.Location = "pune";		
		
		Animal animal=new Animal();
		
		animal.id=152;
		animal.name="Tiger";
		
		animal.forest=forest;
		animal.forest.Location = "pune";
	    
	    
	 	Animal animal2=new Animal(animal);
		
		animal2.id=170;
		animal2.name="Lion";
		animal2.forest.Location="Gujrat";
		
		

		
		System.out.println();
		
		System.out.println(animal2.id);
		System.out.println(animal.forest.Location);
		System.out.println(animal2.forest.Location);
		
		
		

	}

}

class Animal
{
	String name;
	int id;
	
	Forest forest;
	
	public Animal()
	{
		
	}
	
	public Animal(Animal animal)
	{
		this.id=animal.id;
		this.name=animal.name;
		this.forest = new Forest();
		this.forest.Location=animal.forest.Location;
	
	}
	

}

class Forest
{
	String Location; 
}