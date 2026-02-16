package java_home.Multithreading;

import java.util.ArrayList;
import java.util.List;

public class Producer_Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SharedResoure sr=new SharedResoure();
		Producer pro=new Producer();
		Consumer con=new Consumer();
		
		pro.source=sr;
		con.source=sr;
		
		pro.start();
		con.start();
		
		
	}

}

class SharedResoure
{
	
	List<Integer> list=new ArrayList<Integer>();
	
	public synchronized void addNum() throws InterruptedException
	{
		System.out.println("Checking size... ");
		int num=1;
		
		while(list.size()<=10) 	//list.size()=>STOP
		{
			System.out.println("adding number::size is:"+list.size());
			list.add(num);
			System.out.println("Nootifiign the remover");
			num++;
		}
		System.out.println("Entering waiting state....");
		wait();
		System.out.println("Condition fulfilled....stopping to add num");
	}
	
	
	public synchronized void removeNum() throws InterruptedException
	{
		if(list.size()==0)
		{
			wait();
			System.out.println("Nothing to remove");
		}
		else 
		{
		int removed_num =list.remove(0);
		System.out.println("removed num:"+removed_num);
		System.out.println("notifying the producer..");
		notify();
		}
	}
}


class Producer extends Thread
{
	SharedResoure source;
	
	public void run()
	{
		try {
			source.addNum();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

class Consumer extends Thread
{
	SharedResoure source;
	
	public void run()
	{
		try {
			source.removeNum();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		};
		
	}
}
