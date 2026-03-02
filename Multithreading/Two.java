package java_home.Multithreading;

public class Two {

	public static void main(String[] args) throws InterruptedException {
		// B)Implementing Runnable Interface
		
		Myrunnable m=new Myrunnable();
		Thread t=new Thread(m);//pass ref.of runnable
		
		t.start();//call by instance method.
		t.join();
		t.run();//Thread Created.
		
		float i=11.5f;
		if(i/2==0)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Num Even");
		}else {
		System.out.println("not even");
		}
		
	}

}

class Myrunnable implements Runnable
{

	@Override
	public void run() {
		Thread.currentThread().setName("Nanda");
		System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=10;i++)
		{
			System.out.println(3*i);
			
			try {
			Thread.sleep(1500);
			}catch(Exception e)
			{
				e.getMessage();
			}
		  
		}
		
	}
	}
