package java_home.Multithreading.Thread_Priority;

public class Priority1 {

	public static void main(String[] args)throws Exception {
		/* Highest Priority->10->MIN_PRIORITY
		** Lowest Priority->1->MIN_PRIORITY
		** Default_Priority->5->NORM_PRIORITY
		**/
		Thread t1=new Thread(()->{
			 System.out.println("Thread 1:"+Thread.currentThread().getName());
			 for(int i=1;i<10;i++)
			 {
				 System.out.println("Thread 1:"+i*5);
			 }
		});
		
		Thread t2=new Thread(()->{
			 System.out.println("Thread 2:"+Thread.currentThread().getName());
			 for(int i=1;i<10;i++)
			 {
				 System.out.println("Thread 2:"+i*2);
			 }
		});
		
		Thread t3=new Thread(()->{
			 System.out.println("Thread 3:"+Thread.currentThread().getName());
			 for(int i=1;i<10;i++)
			 {
				 System.out.println("Thread 3:"+i*10);
			 }
		});
		
		t1.start();
		
		
		t2.start();
		
		
		t3.start();
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());

	}

}
