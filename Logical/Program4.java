package java_home.Logical;

public class Program4 {

	public static void main(String[] args) {
		//Count Vowels and Consonants
		
		String str="Java programming";
		int vowels=0, consonants=0;
		str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch =='a' || ch == 'e'  || ch == 'i' || ch == 'o' || ch == 'u')
			{
				vowels++;
			}
			else if( ch>='a' && ch<='z')
			{
				consonants++;
			}		
		}
		System.out.println("Vowels "+vowels);
		System.out.println("Consonants "+consonants);

	}

}
