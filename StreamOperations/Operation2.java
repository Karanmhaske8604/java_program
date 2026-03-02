package java_home.StreamOperations;

import java.util.List;
import java.util.function.Predicate;

public class Operation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(11,23,43,76,85,32,64,7);
		//Always need one terminal operation to start Stream pipeline.
		list.stream().filter((i)->{return i%2==0;}).forEach((j)->{System.out.println(j);});
	System.out.println("*****************************");
		Student first=new Student(1,"Karan");
		Student second=new Student(2,"Sai");
		Student third=new Student(3,"Abhishek");
		
		List<Student> list2=List.of(first,second,third);
		
		Predicate<Student> pred=(p)->{ return p.name.length()>=5;};
		list2.stream().filter(pred).forEach((s)->{
			System.out.println(s.id);
			System.out.println(s.name);
		
		});
	
	}

}

class Student
{
 int id;
 String name;
 
 public Student(int id,String name)
 {
	 this.id=id;
	 this.name=name;
 }
}
