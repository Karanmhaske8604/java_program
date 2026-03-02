package java_home.Logical;

public class Program3 {

	public static void main(String[] args) {
		//Palindrome or not
		
		String str="madam";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		
		if(str.equals(rev))
		{
			System.out.println(str+" is Palindrome");
		}
		else
		{
			System.out.println(str+" is not Palindrome");
		}

	}

}
