package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTen {

	public static void main(String[] args) {

		try (
		ExecutorService ex=Executors.newFixedThreadPool(2);
		)
		{
		ex.execute(()->{
			Thread.currentThread().setName("Task0");
			for(int i=0;i<5;i++)
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println(i*100);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		ex.execute(()->{
			Thread.currentThread().setName("Task2");
			for(int i=0;i<5;i++)
			{
				System.out.println(Thread.currentThread().getName());
				System.out.println(i*2);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		}

	}

}
