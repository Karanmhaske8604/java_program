package java_home.StreamOperations;


import java.util.ArrayList;
import java.util.List;

public class Operation8 {

	public static void main(String[] args) {

		Students stud=new Students(1, "KARAN");
		Students stud2=new Students(1,"KESHAV");
		
		List<Students> list=new ArrayList<Students>();
		
		list.add(stud2);
		list.add(stud);
		
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
 public  void toString(int id,String Name)
 {
	 this.id=id;
	 this.Name=Name;
 }
 
 
 
 
}