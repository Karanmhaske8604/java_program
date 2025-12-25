package java_home.Collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedBehave2 {

			public static void main(String[] args) 
			{
				
				ArrayList<Books> list1=new ArrayList<Books> ();
				for(int i=0; i<10000000;i++)
				{
					list1.add(new Books(1,"Hekllo",65.23,8.32));
				}
				long Start_time=System.nanoTime();
				System.out.println(list1.get(9155626));//Searching time in ArrayList is faster because it jump to index.
				long Stop_time=System.nanoTime();
				System.out.println("Time Taken by ArrayList"+(Start_time-Stop_time)/1000);
				
				LinkedList list2=new LinkedList();
				for(int i=0; i<10000000;i++)
				{
					list2.add(new Books(2,"Mekllo",55.3,7.72));
				}
				long Start_time1=System.nanoTime();
				System.out.println(list2.get(9566688));//Searching in LinkedList is slow because L.list checks node to node.
				long Stop_time1=System.nanoTime();
				System.out.println("Time Taken by LinkedList"+(Start_time1-Stop_time1)/1000);
				
				


			}
		}
		
class Books
		{
		   int id;
		   String name;
		   double price;
		   double rating;
		   
		   public Books(int id,String name,double price,double rating)
		   {
			   this.id=id;
			   this.name=name;
			   this.price=price;
			   this.rating=rating;
			   
		   }
		   }
