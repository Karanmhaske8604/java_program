package java_home.Collection;
import java.util.*;
import java.util.Scanner;

public class ArrayListCity {

	public static void main(String[] args) {
		
		ArrayList r=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How Many cities you want to Store:");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=1; i<=n; i++)
		{
			System.out.println("Enter "+i+" city names");
			String name=sc.nextLine();
			r.add(name);
		}
		System.out.println("The city names:"+r);
		r.clear();
		System.out.println("ArrayList after removing elememts:"+r);
		
		

	}

}
