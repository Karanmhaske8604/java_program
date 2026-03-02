package java_home.Multithreading;

public class Racecondn {

	public static void main(String[] args) throws InterruptedException {
		// Race Condition Avoid by Synchronized
		Counter_Demo demo=new Counter_Demo();
		
		//	Counter_Demo demo2=new Counter_Demo();
				
			One_T on=new One_T();
			Two_T tw=new Two_T();
			on.demo=demo;
			tw.demo=demo;
			
			on.start();
			tw.start(); 			
			
			Thread.sleep(2500); 
			System.out.println("Count 1::"+demo.getCount());
			
			System.out.println("Count 2::"+demo.getCount2());
		//	System.out.println(demo2.getCount());

			
		}
	}

class Counter_Demo
{
	int count=0;
	int count2=0;
		
	public void Increase()
	{
		synchronized(this){
		 this.count++;	
			}
		 this.count2++;
		}
		
	public synchronized void decrease()
		{
			this.count--;
		}
		public int getCount()
		{
			return this.count;
		}
		
		public int getCount2()
		{
			return this.count2;
		}
	}


class One_T extends Thread{
		
		Counter_Demo demo;
		
		public void run()
		{
			for(int i=0;i<1000000;i++)
			{
				demo.Increase();
			}
		}
	}

class Two_T extends Thread
{
	Counter_Demo demo;
		
		public void run() {
		for(int i=0;i<500000;i++)
		{
			demo.decrease();
		}
	}
} 