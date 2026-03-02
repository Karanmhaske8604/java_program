package java_home.Multithreading;

public class RaceCondin {

	public static void main(String[] args) throws InterruptedException {
		Counter count=new Counter();
		Counter count2=new  Counter();
		
		FirstThread first=new FirstThread(count);
		SecondThread second =new SecondThread(count2);
		
		first.start();
		second.start();
		
		Thread.sleep(3000);
		System.out.println(count.getcount());
		System.out.println(count2.getcount());
		
		
		
		
	}

}

class Counter
{
	int count =90;
	
	public void increase()
	{
		this.count++;
		
	}
	
	public int getcount()
	{
		return this.count;
	}
}

class FirstThread extends Thread
{
	Counter count;
	public FirstThread(Counter count)
	{
		this.count=count;
	}
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			count.increase();
		}
	}
}

class SecondThread extends Thread
{
	Counter count;
	public SecondThread(Counter count)
	{
		this.count=count;
	}
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			count.increase();
		}
	}
}
