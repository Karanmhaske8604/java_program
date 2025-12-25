package java_home.String;

public class PalindromeInteger {

	public static void main(String[] args) {
		int demo = 121;
		int remo = demo;
		int seno = 0;
		
		
	while (remo > 0) {
		
		int veno = remo % 10;
		System.out.println(veno);
	
		seno =seno * 10 + veno;
		System.out.println(seno);
		
		remo = remo / 10; 
		System.out.println(remo);
		
		System.out.println("*****");
	}
	if (demo == seno) {
		System.out.println(demo+" is palindrome");
	}else {
	 System.out.println("is not palindrome");
	}
	}

	}
