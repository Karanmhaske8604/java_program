package java_oops;

public class Fourth {

	public static void main(String[] args) {
		// Hybrid inheritence in which more then one inheritence occur at same time 
		Sanna s=new Sanna();
		s.show();
		System.out.println(s.address);
		
		Rina r=new Rina();
		r.show();
		System.out.println(r.address);
		
		Raana rana=new Raana();
		System.out.println(rana.address);
	}

}

class Anna
{
	final String address="524Hingne";
	public void show()
	{
		 String salary="1000.0";
		 System.out.println(salary);
	}
	
}

class Sanna extends Anna
{
 //Single level Inheritence
	String  address="894Alandi";
}

class Raana extends Sanna
{
  //Multilevel Inheritence	
}

class Rina extends Anna
{
 //Hierarchical Inheritence	
}

/*class Mina extends Anna,Sanna
{
//Multiple Inheritence occurs ambuiguty i.e Diamond Problem 	
}*/
