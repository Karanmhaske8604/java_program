package java_home.Collection;
import java.util.Map;
import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
	Map<Student_354322, Integer> map=new Hashtable<Student_354322, Integer>();
		
		map.put(new Student_354322(1,"Mithun"), 12);
		map.put(new Student_354322(1,"Mithun"), 23);
		
		System.out.println(map);

	}
}

class Student_354322
{
	int id;
	String name;
	public Student_354322(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return this.id+" "+this.name;
	}
	
	public int hashCode()
	
	{
		return this.id;
	}
	public boolean equals(Object obj)
	{
		return true;
		
	}// TODO Auto-generated method stub

	}

