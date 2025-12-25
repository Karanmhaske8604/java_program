package java_home.Oops;

public class Polyobj {

	public static void main(String[] args) {
		
		Animals ani=new Dog();//Reference of parent class but object of child class this is polymorphic object.it shows only common methods in between them.  
		ani.Nature();//compile time shows ref.of parent but gives op of child class at run time
		((Dog)ani).Run();//type casting to get extra method of child class
	/*	if (ani instanceof Dog)
		{
			((Dog) ani).Run();
		}*/

	}

}

class Animals
{
 public void Nature()
 {
	 System.out.println("We have two types");
 }
}

class Dog extends Animals
{
 public void Nature()
 {
	 System.out.println("I am pet Animal");
 }
 
 public void Run()//this is true extensibility in OOP
 {
	 System.out.println("I am also can be wild");
 }
}