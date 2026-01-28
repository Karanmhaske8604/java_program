package java_home.StreamOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Assign2 {

	public static void main(String[] args) {
		// Make grp of Second Highest Marks from each dept.
	
		Map<String,List<Studnts>> stu=	List.of(new Studnts(1,"IT",93.20f),new Studnts(12,"Physics",90.80f),new Studnts(31,"Bio",95.40f),new Studnts(16,"Physics",97.50f),new Studnts(36,"Bio",89.20f))
		.stream()
		.collect(Collectors.groupingBy(Studnts::getsub));
	System.out.println(stu);
	
	for(Map.Entry<String,List<Studnts>> m:stu.entrySet())
	{
		m.getValue().stream()
		.sorted((i,j)->{return Float.compare(i.getMarks(),j.getMarks());})
		.limit(1)
		//.skip(1)
		.forEach(System.out::println);
	}
	
		
	}

}

class Studnts
{
	int rollno;
	 String sub;
	 Float marks;
	 
 public Studnts(int rollno, String name, Float marks) {
		super();
		this.rollno = rollno;
		this.sub = name;
		this.marks = marks;
	}
 
 public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getsub() {
		return sub;
	}
	public void setsub(String name) {
		this.sub = name;
	}
	
	public Float getMarks() {
		return marks;
	}
	public void setMarks(Float marks) {
		this.marks = marks;
	}
 
	public String toString()
	{
		return this.rollno+" "+this.sub+" "+this.marks;
		
	}
}
