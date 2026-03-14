package java_home.ExceptionHanding;

public class Second {

	public static void main(String[] args) {
		
            int i=-12;
		
		try
		{
			
			/**
			 * Only single exception is thrown from the try block.
			 */
			if(i>10 && i<20)
			{
				throw new Ten_Exception();
			}
			else if(i>20 &&  i<30)
			{
				throw new Twenty_Exception();
			}
			else if(i>30 && i<40)
			{
				throw new Thirty_Exception();
			}
			else
			{
				System.out.println("Out off League "+i);
			}
		}
		catch(Twenty_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Ten_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		catch(Thirty_Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			System.out.println("---THE END---");
		}
	}

}

// Compile => Handle them => Try and catch block.
class Ten_Exception extends Exception
{
	
	
	public Ten_Exception()
	{
		super("10 exception present!");
	}
}

class Twenty_Exception extends Exception
{
	public Twenty_Exception()
	{
		super("20 Exception present !");
	}
}

class Thirty_Exception extends Exception
{
	public Thirty_Exception()
	{
		super("30 Exception !");
	}
}