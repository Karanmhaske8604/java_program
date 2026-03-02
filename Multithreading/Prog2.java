package java_home.Multithreading;

public class Prog2 {

	public static void main(String[] args) {
		/* Write a program in which thread sleep for 6 sec in the loop in reverse order from 
           100 to 1 and change the name of thread.
		 */
		
		Thread t1=new Thread(()->{
			
			try{
				Thread.currentThread().setName("Prog2");
				System.out.println("New name of Thread"+Thread.currentThread().getName());
				for(int i=100;i>=1;i--)
			{
				System.out.println(i);
				
				Thread.sleep(6000);
				}
				
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

		});
		
		t1.start();

	}

}
