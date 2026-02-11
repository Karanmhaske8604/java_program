package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ExecutorOne {

	public static void main(String[] args) {
		// A] execute()->Runnable
		
		Runnable r1=()->{
			System.out.println("Task One");
			System.out.println("first Thread:"+Thread.currentThread().getName());
			
			int i=0;
			while(i<5)
			{
				i++;
				System.out.println(i);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};
		Runnable r2=()->{
			System.out.println("Task Two");
			System.out.println("first Thread:"+Thread.currentThread().getName());
			int i=0;
			while(i<5)
			{
				i++;
				System.out.println(i);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};		
		Runnable r3=()->{
			System.out.println("Task Three");
			System.out.println("first Thread:"+Thread.currentThread().getName());
			int i=0;
			while(i<5)
			{
				i++;
				System.out.println(i);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};
		Runnable r4=()->{
			System.out.println("Task Four");
			System.out.println("first Thread:"+Thread.currentThread().getName());
			int i=0;
			while(i<5)
			{
				i++;
				System.out.println(i);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};	
		
		ExecutorService ex=Executors.newFixedThreadPool(2);
		
		ex.execute(r1);
		ex.execute(r2);
		ex.execute(r3);
		ex.execute(r4);
	
	}
}


