package java_home.StreamOperations.Method_Reference;

import java.util.List;

public class Reference2 {

	public static void main(String[] args) {
		// 2)Instance Method Reference.
		
		Lemo lemo=new Lemo();
		
	int ref2=List.of(45,55,65,75,85)
		.stream()
		.filter(lemo::separate)
		.reduce(1,lemo::mult);
	
	System.out.println(ref2);

	}
}

class Lemo
{
	public boolean separate(int i)
	{
		return i>50;
	}
	
	public int mult(int i,int j)
	{
		return i+j;
	}
}
