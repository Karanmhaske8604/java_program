package java_home;

public class Class_Student {

	public static void main(String[] args) {
		// 
		Student stud=new Student();
		stud.Name="Omkar";
		stud.Rollno=7415;
		stud.Subject();
		
		Student stud1=new Student();
		stud1.Name="Karan";
		stud1.Rollno=7416;
		stud1.Subject();
		
		Student stud2=new Student();
		stud2.Name="Keshav";
		stud2.Rollno=7417;
		stud2.Subject();
		System.out.println("Congratulations to all..");
		

	}

}

class Student
{
 String Name;
 int Rollno;
  
 public void Subject()
 {
	 String Sub="Comp.Sci";
	 System.out.println("The Subject of the Student is "+Sub);
	 System.out.println("The Student passed the subject "+Name);//instance variable access in method
	 System.out.println("The Student RollNo is "+Rollno);
 }
}

