package java_home.Logical;

public class Progarm5 {

	public static void main(String[] args) {
		// Reverse integer 
		
		int num=12345;
		
		int revnum=0;
		
		while(num!=0)
		{
			int digit=num%10;
			revnum=revnum*10+digit;
			num/=10;
		}
		System.out.println("Reversed Number "+revnum);

	}

}
