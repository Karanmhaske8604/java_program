package java_home.Multithreading;

public class RaceConnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Flower flower=new Flower();
		
        Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		t1.flower=flower;
		t2.flower=flower;
		
		t1.start();
		t2.start();
		
		Thread.sleep(2500);
		System.out.println(flower.getcount());
		System.out.println(flower.getcount2());
		
		
	}

}


class Flower
{
	int count=100;
	int count2=20;
	
	public void Increase()
	{
		synchronized(this) {
		this.count++;
		}
		this.count2++;
	}
	
	public synchronized void Decrease()
	{
		this.count--;
	}
	
	public int getcount()
	{
		return this.count;
	}
	
	public int getcount2()
	{
		return this.count2;
	}
	
}


class Thread1 extends Thread
{
	Flower flower;
	
	public void run()
	{
		for(int i=0;i<5000;i++)
		{
			flower.Increase();
		}
	}

}

class Thread2 extends Thread
{
	Flower flower;
	
	public void run()
	{
		for(int i=0;i<5000;i++)
		{
			flower.Decrease();
		}
	}
}