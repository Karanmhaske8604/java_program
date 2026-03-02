package java_home.String;

public class ReversedAdv {

	public static void main(String[] args) {
		String str="Mhakse";
		
		StringBuilder reversed=new StringBuilder(str.toLowerCase()).reverse();
		System.out.println(reversed);
	}

}
