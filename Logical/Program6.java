package java_home.Logical;

public class Program6 {

	public static void main(String[] args) {
		// Largest of three numbers
		
		int a=10,b=20,c=30;
		
		int largest =(a>b)?(a>c?a:c):(b>c?b:c);
		
		System.out.println("Largest of three "+largest);

	}

}
