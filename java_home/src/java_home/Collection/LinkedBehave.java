package java_home.Collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedBehave {

	public static void main(String[] args) {
		
		ArrayList<Book> list1=new ArrayList<Book> ();
		for(int i=0; i<10000000;i++)
		{
			list1.add(new Book(1,"Hekllo",65.23,8.32));
		}
		long Start_time=System.nanoTime();
		System.out.println(list1.remove(9155626));//indices shiftiing takes time in ArrayList
		long Stop_time=System.nanoTime();
		System.out.println("Time Taken by ArrayList"+(Start_time-Stop_time)/1000);
		
		LinkedList list2=new LinkedList();
		for(int i=0; i<10000000;i++)
		{
			list2.add(new Book(2,"Mekllo",55.3,7.72));
		}
		long Start_time1=System.nanoTime();
		System.out.println(list2.remove(9566688));//There is no indices shifting in LinkedList.
		long Stop_time1=System.nanoTime();
		System.out.println("Time Taken by LinkedList"+(Start_time1-Stop_time1)/1000);
		
		


	}
}
class Book
{
   int id;
   String name;
   double price;
   double rating;
   
   public Book(int id,String name,double price,double rating)
   {
	   this.id=id;
	   this.name=name;
	   this.price=price;
	   this.rating=rating;
	   
   }

}

