package java_home.Oops;

public class Abstraction1 {

	public static void main(String[] args) {
		Study stud= new Students();
		stud.dorest();
		System.out.println(stud.i);

	}

}

abstract class Study
{
	int i=123;
	
	public abstract void dostudy(String s);
	
	public void dorest()
	{
	System.out.println("Take some rest.");	
	}
}

class Students extends Study
{
	public void dorest()
	{
		System.out.println("you have to study");
	}

	@Override
	public void dostudy(String s) {
		System.out.println("");
	}
}
