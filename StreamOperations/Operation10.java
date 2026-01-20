package java_home.StreamOperations;

import java.util.List;

public class Operation10 {

	public static void main(String[] args) {
		//
		List.of(new Studentss(101,"Karan",78.80),
				new Studentss(102,"KEshav",98.50),
				new Studentss(103,"Kajal",58.20),
				new Studentss(104,"Shweta",68.40),
				new Studentss(105,"gayatri",92.20))
		.stream()
		.filter((i)->{return i.Marks>90 && i.Marks<99;})
		.sorted((i,j)->{return Double.compare(j.Marks, i.Marks);})
		.limit(3)
		.skip(0)
		.forEach((i)->{System.out.println("First Two Ranker :-"+i);});
		//.count();
	
	}

}

class Studentss
{
	int RollNo;
	String Name;
	Double Marks;
	
	public Studentss(	int RollNo,	String Name,Double Marks)
	{
		this.RollNo=RollNo;
		this.Name=Name;
		this.Marks=Marks;
	}
	
	public String toString()
	{
		return this.Name+"("+this.Marks+")";
		
	}
}
