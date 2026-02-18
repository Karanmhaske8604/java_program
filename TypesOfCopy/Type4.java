package java_home.TypesOfCopy;

public class Type4 {

	public static void main(String[] args) throws CloneNotSupportedException {
		//Deep Copy 
		
		Author ar=new Author();
		ar.Name="James Gosling";
		
		Book bk=new Book();
		
		bk.Title="Java";
		bk.Price=250;
		bk.author=ar;
		
		Book bk2=(Book)bk.clone();
		
		bk2.Title="Python";
		bk2.author.Name="Guido van Rossum";
		
		System.out.println("Book1::"+bk.Title+" "+bk.Price+" "+bk.author.Name);
		
		System.out.println("Book2::"+bk2.Title+" "+bk2.Price+" "+bk2.author.Name);
		
		

	}

}

class Book implements Cloneable
{
	String Title;
	int Price;
	
	Author author;
	
	
	public Object clone() throws CloneNotSupportedException
	{
		Book b1=(Book)super.clone();
		b1.author=(Author)this.author.clone();	//Main Solution	
		
		return b1;
		
	}

}

class Author implements Cloneable
{
	String Name;
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
