package java_home.TypesOfCopy;

public class Type3 {

	public static void main(String[] args) throws CloneNotSupportedException {
		// Shallow Copy=>made by .clone()
		
		RoyalEnfield rf=new RoyalEnfield("Continental GT", 650);
		rf.cc=125;
		
		System.out.println(rf.cc);
		System.out.println(rf.Model);
		
		RoyalEnfield rf2=(RoyalEnfield) rf.clone();
		System.out.println(rf.cc);
		System.out.println(rf.Model);
		
		
		
	}

}

class RoyalEnfield implements Cloneable
{
	String Model;
	int cc;
	
	public RoyalEnfield(String Model,int cc)
	{
		this.cc=cc;
		this.Model=Model;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
}
