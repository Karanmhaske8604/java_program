package java_home.Multithreading;


public class Volatilekey {

	public static void main(String[] args) {
	
		Thread read=new Thread(()->{
			System.out.println("Reading flag...");
			while(flag==true)
			{
				
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Reading Operation ended...");
				});
		
		Thread write=new Thread(()->{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Setting flag to false...");
			flag=false;
			
		});
		
		read.start();
		write.start();
		
		flag=true;
	}
	
	volatile static boolean flag=true;
	

}


