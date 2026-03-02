package java_home.Multithreading;

import java.util.ArrayList;
import java.util.List;

public class MutualSync {

	public static void main(String[] args) {
		Source sr=new Source();
		
		Prod p=new Prod();
		
		Cons con=new Cons();
		Cons con2=new Cons();
		
		p.sr=sr;
		con.sr=sr;
		con2.sr=sr;
		p.start();
		con.start();
		con2.start();
		

	}
}


class Source
{
	 private List<Integer> list=new ArrayList<Integer>();
	int num=1;
	
	
	
	public synchronized  void add() throws InterruptedException
	{
		
		if(list.size()==10)
		{
			System.out.println("memory full ....waiting to clear...");
			wait();
		}
		list.add(num);
		System.out.println("removers being notifyed.....");
		notifyAll();
		System.out.println("added:"+num);
		num++;
	}
	
	
	public synchronized void remove() throws InterruptedException
	{
		if(list.size()==0)
		{
			System.out.println("waiting for some numbers.....");
			 wait();
		}
		
		int rem=list.remove(0);
		System.out.println("removde:"+rem);
		System.out.println("notifying the producer:::");
		notify();
	}
}



class Prod extends Thread
{
	Source sr;
	
	public void run()
	{
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				sr.add();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}




class Cons extends Thread
{
	Source sr;
	
	public void run()
	{
		while(true)
		{
			System.out.println("Consumer:"+Thread.currentThread().getName()+"Cons");
			try {
				Thread.sleep(2000);
				sr.remove();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}