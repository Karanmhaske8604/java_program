package java_home.ExceptionHanding;

public class First {

	public static void main(String[] args) {

		  int i=51;
		  
		  
		 
		  try {
		    if(i>50)
		    {
		    	throw new InvalidOperationException("Greater value.");
		    }
		  }
		  catch(InvalidOperationException ex)
		  {
			  System.out.println(ex.getMessage());
		  }
		    System.out.println("You are welcome....");
		   System.out.println("THE END");
		

	}
}

//IS-A

class InvalidOperationException extends Exception
{
	
	public InvalidOperationException(String str)
	{
		super(str);
		//Exception
		//Throwable  => Getmessage => Attach.
	}
	
}