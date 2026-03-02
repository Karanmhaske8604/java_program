package java_home.Multithreading;

public class Fourth {

	public static void main(String[] args) {
		// Lambda in Runnable Interface
		
		Thread t=new Thread(()->{
			for(int i=0;i<100;i++)
			{
				if(i%2==0)
				{
					System.out.println("odd:"+i);
				}
				
				try {
				Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.getMessage();
				}
				
			}
			
		});
		
		Thread t2=new Thread(()->{
			int count=1;
			while(count<50)
			{
				System.out.println("count");
				count++;;
				try {
					Thread.sleep(1000);
					}
					catch(Exception e)
					{
						e.getMessage();
					}
			}
		});
		
		t.start();
		t2.start();

	}

}
