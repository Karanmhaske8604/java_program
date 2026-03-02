package java_home.Multithreading;

import java.util.ArrayList;
import java.util.List;

public class Producer_Consumer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sourcee sr=new Sourcee();
		
		Producerr pro=new Producerr();
		
		Consumerr con=new Consumerr();
		pro.sr=sr;
		con.sr=sr;
		
		pro.start();
		con.start();
		
		
		
	}

}

class Sourcee
{
private List<Integer> list=new ArrayList<Integer>();;
int num=1;


public synchronized void add() throws InterruptedException
{
	if(list.size()==10)
	{
		System.out.println("Memory fulled...waiting to clear...");
		wait();
	}
	list.add(num);
	System.out.println("Remover being notified....");
	notifyAll();
	System.out.println("Added:"+num);
	num++;
}

public synchronized void remove() throws InterruptedException
{
	if(list.size()==0)
	{
		System.out.println("Waiting for some Numbers...");
		wait();
		
	}
	int rem=list.remove(5);
	System.out.println("Removed:"+rem);
	System.out.println("notifying the producer::");
	notify();
	
	}

}


class Producerr extends Thread
{
	Sourcee sr;
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				sr.add();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Consumerr extends Thread
{
	Sourcee sr;
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(2000);
				sr.remove();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
		
	}
	}