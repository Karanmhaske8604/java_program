package java_home.String;

public class Palin {

	public static void main(String[] args) {

		String str="1001";
		boolean ispalindrome=true;
		//String str1=str.replaceAll().toLowerCase();
		int start=0;
		int end=str.length()-1;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				ispalindrome=false;
				break;
			}
			
		}
		if(ispalindrome)
		{
			System.out.println(str+" is palindrome");
		}
		else
		{
			System.out.println(str+" is not palindrome");
		}
	}

}
