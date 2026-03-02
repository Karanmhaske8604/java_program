package java_home.Multithreading;

public class VolatileKw {

	volatile static boolean flag=true;
	public static void main(String[] args)throws Exception {
		// Volatile Keyword
		
		
		
		Thread t1=new Thread(()->{
			
			System.out.println("Thread is running");
			while(flag==true)
			{
				//Syso is synchronized.
				
			}
			System.out.println("Flag is now became false..");
		});
		
		t1.start();
		System.out.println("Flag before change:"+flag);
		Thread.sleep(15000);
		 flag=false;
		 
		 System.out.println("Flag in now:"+flag);
		 

	}

}
