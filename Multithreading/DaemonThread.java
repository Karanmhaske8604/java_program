package java_home.Multithreading;

public class DaemonThread {

	public static void main(String[] args) {
		// Daemon Thread
		
		Thread t1=new Thread(()->{
			
			for(int i=0;i<100;i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Daemon:"+i);
			}
		});
		
         Thread t2=new Thread(()->{
			
			for(int i=0;i<15;i++)
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Normal:"+i);
			}
		});
         
         t1.setDaemon(true);
         t1.start();
         t2.start();

	}

}
