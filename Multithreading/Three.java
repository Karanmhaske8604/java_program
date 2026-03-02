package java_home.Multithreading;

public class Three {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt=new MyThread();
		MyThread mt1=new MyThread();
		MyThread mt2=new MyThread();
		MyThread mt3=new MyThread();
		
		mt.start();
		mt.join();
		mt2.start();
		mt3.start();
		mt1.start();
		
		mt.run("Nanda");
		
		

	}

}

class MyThread extends Thread
{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<10;i++)
		{
			for (int j=0;j<50;j++)
			{
				if(i==j)
				{
					System.out.println("hiii");
				}
			}
			try {
			Thread.sleep(1500);
			}catch(Exception e)
			{
				e.getMessage();
			}
		}
	}
	
	public void run(String k)
	{
		for(int i=20;i<50;i++) {
			
			System.out.println(Thread.currentThread().getName());			
		System.out.println(k+i);
		}
	}
	
}
