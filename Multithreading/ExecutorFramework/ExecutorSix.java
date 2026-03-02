package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSix {

	public static void main(String[] args) {
		//SingleThreadExecutor
		
		
		ExecutorService ex=Executors.newSingleThreadExecutor();
		
		ex.execute(()->{
			System.out.println(Thread.currentThread().getName()+"TAsk1");
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
			}
		});
		
		ex.execute(()->{
			System.out.println(Thread.currentThread().getName()+"TAsk2");
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
			}
		});
		
		ex.execute(()->{
			System.out.println(Thread.currentThread().getName()+"TAsk3");
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
			}
		});
		
		ex.shutdown();
		
		
	}

}
