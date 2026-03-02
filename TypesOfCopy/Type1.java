package java_home.TypesOfCopy;

public class Type1 {

	public static void main(String[] args) {
		// Reference Copy

		Student stud=new Student();
		
		stud.id=101;
		stud.Name="Karan";
		
		Student stud2=stud;//Reference Copy
		
		System.out.println(stud2.id);
		System.out.println(stud2.Name);
		
		System.out.println(stud==stud2);
		System.out.println(stud.equals(stud2));
		
		stud2.Name="keshav";
		System.out.println(stud2.Name);
		
	}
}

class Student
{
	int id;
	String Name;
}
