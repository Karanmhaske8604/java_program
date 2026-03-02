package java_home.StreamOperations;


import java.util.ArrayList;
import java.util.List;

public class Operation8 {

	public static void main(String[] args) {

		Students stud=new Students(1, "KARAN");
		Students stud2=new Students(1,"KESHAV");
		
		List<Students> list=List.of(stud,stud2);
		
		
		
		System.out.println(list);
		
	}

}

class Students
{
 int id;
 String Name;
 
 public Students(int id,String Name)
 {
	 this.id=id;
	 this.Name=Name;
 }
 public  String toString()
 {
	 this.id=id;
	 return this.Name=Name;
 }
 
 
 
 
}