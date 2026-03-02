package java_home.Multithreading;

public class Synchronization2 {

	public static void main(String[] args) throws InterruptedException {
		
		classdemo demo=new classdemo();
		
		classone one=new classone(demo);
		classone second=new classone(demo);
		
		one.start();
		second.start();
		Thread.sleep(2000);
		
		System.out.println(demo.getcount());
		
		
	}
}

class classdemo
{
	static int count=0;
	
	public void increment()
	{
		synchronized(classdemo.class) {
		count++;
		}
	}
	
	public int getcount()
	{
		return this.count;
	}

}

class classone extends Thread
{
	classdemo cd;
	
	public classone(classdemo cd)
	{
		this.cd=cd;
	}
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			cd.increment();
		}
	}
}