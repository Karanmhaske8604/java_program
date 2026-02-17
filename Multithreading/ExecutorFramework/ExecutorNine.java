package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorNine {

	public static void main(String[] args) {
		 ExecutorService ex=Executors.newCachedThreadPool();
		 
		 Runnable run=()->{ 
			 try {
				Thread.sleep(1500);
			 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
			 System.out.println(Thread.currentThread().getName());
			 System.out.println("TASK1");
		 };
		 
		 Runnable run2=()->{ 
			 try {
					Thread.sleep(1500);
				 } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				 }

			 System.out.println(Thread.currentThread().getName());
			 System.out.println("TASK2");
		 };
		 Runnable run3=()->{ 
			 try {
					Thread.sleep(1500);
				 } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				 }

			 System.out.println(Thread.currentThread().getName());
			 System.out.println("TASK3");
		 };
		 
		 
		 ex.execute(run);
		 ex.execute(run2);
		 ex.execute(run3);
		 
		 ex.shutdown();
		 
		 
	}

}
