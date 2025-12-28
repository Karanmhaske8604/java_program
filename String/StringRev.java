package java_home.String;

public class StringRev {

	public static void main(String[] args) {
		String str="Karan";
		String Revstr="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			Revstr+=str.charAt(i);
			System.out.println("ReverseString:-"+Revstr);
		}
		

	}

}
