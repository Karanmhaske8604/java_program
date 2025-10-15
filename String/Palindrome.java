package java_home.String;

public class Palindrome {

	public static void main(String[] args) {

		String str="11511";
		boolean flag=true;
		
		int start=0;
		int end=str.length()-1;
		
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end))
			{
				flag=false;
				break;
			}
			start++;
			end--;
		}
		if(flag) {
			System.out.println(str+" is palindrome");
		}
		else {
			System.out.println(str+" is not palindrome");
		}
		
	}

}
