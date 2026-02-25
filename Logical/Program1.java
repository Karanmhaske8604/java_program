package java_home.Logical;

public class Program1 {

	public static void main(String[] args) {
		// String reversed without Adv concept
		
		String str="Authority";
		String Rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			Rev+=str.charAt(i);
		}
		System.out.println(Rev);

	}

}
