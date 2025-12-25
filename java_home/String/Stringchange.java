package java_home.String;

public class Stringchange {

	public static void main(String[] args) {
		
		demo.change("LETTER");

		
	}

}
class demo{
	
	public static void change(String str3)
	{
		String str=str3;//Passing str3 to the str object.
		StringBuffer sb=new StringBuffer();//StringBuffer methods to append the string which convert the Values
		String str2=null;
		StringBuffer sb2=new StringBuffer();
		
		
				
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				str2= sb2.append(str.charAt(i)).toString().toLowerCase();//Append String characters and convert 
				
				sb.append(str2);//
			}
			else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
