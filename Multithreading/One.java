package java_home.Multithreading;

public class One {

	public static void main(String[] args)throws Exception {
		// A) Extending Thread class
		

		Superior sp=new Superior();
		Superior sp2=new Superior();
		Superior sp3=new Superior();
		Superior sp4=new Superior();
		sp.start();
		sp2.start();
		sp3.start();
		sp4.start();
		
		sp.run(10);
		
		int count=0;
		while(count < 50)
		{
			System.out.println("from while...");
			Thread.sleep(1500);
			count++;
			
		}

	}

}

class Superior extends Thread
{
	public void run()
	{
		System.out.println("Thread  class run method..");
		for(int i=0;i<10;i++)
		{
			System.out.println(i);;
		
		
		try {
		Thread.sleep(1500);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
	  }
	}
	
	public void run(int j) throws Exception
	{
		System.out.println("custom run method..");
		for(int i=j;i<15;i++)
		{
		
			System.out.println("hello ji"+j);
		    Thread.sleep(2000);
		}	
	}
}
