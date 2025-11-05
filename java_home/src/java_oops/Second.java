package java_oops;

public class Second {

	public static void main(String[] args) {
		Cat c=new Cat();
		System.out.println(c.Nature);
		c.run();
		c.display();
		
	}

}

class Animal
{
 String Nature="Wild..";
 public void run()
 {
	 System.out.println("We live in jungle..");
 }
}

class Tiger extends Animal
{
	void display() 
	{
		System.out.println("I am a predetor..");
    }
}

class Cat extends Tiger
{
	//This is multi-level inheritence.In which Cat have inherit the property of Tiger and Animal
}