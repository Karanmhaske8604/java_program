package java_home.methods;

public class Java_method {

	public static void main(String[] args) {

		Book book=new Book(10,20);//constructor call.
		book.display();

	}
}


class Book
{
   public Book() //default constructer.non-parameterized
   {
	   System.out.println("good morning");
   }
   
   public Book(int i,int j)//parameter constructer.
   {
	   System.out.println(i*j);
	   System.out.println(i/j);
   }
   
   public void display()
   {
	   System.out.println("we will continue...");
   }
}
