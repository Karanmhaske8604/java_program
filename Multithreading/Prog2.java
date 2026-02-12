package java_home.Multithreading;

public class Prog2 {

	public static void main(String[] args) {
		
		Thread t1=new Thread(()->{
			
			try{
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
