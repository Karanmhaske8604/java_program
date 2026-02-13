package java_home.Multithreading.Thread_Priority;

public class Priority2 {

	public static void main(String[] args) {
		
		Thread  t1=new  Thread(()->{
			boolean flag=true;
			while(flag)
			{
				System.out.println("The Thread1 is Running..");
				while(flag)
				{
					try {
					Thread.sleep(2000);
				}catch(Exception e)
					{
					System.out.println(e.getMessage());
					}
				}
			}
		});
		
		Thread  t2=new  Thread(()->{
			boolean flag=true;
			while(flag)
			{
				
				while(flag)
				{
					System.out.println("The Thread2 is Running..");
					try {
						Thread.sleep(2000);
					}catch(Exception e)
						{
						System.out.println(e.getMessage());
						}
				}
			}
		});
		Thread  t3=new  Thread(()->{
			boolean flag=true;
			while(flag)
			{
				while(flag)
				{
					System.out.println("The Thread3 is Running..");
				}
			}
		});
		
		t1.setPriority(10);
		t1.start();

		t2.setPriority(1);
		t2.start();

		t3.setPriority(5);
		t3.start();

	}

}
