package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorFive {

	public static void main(String[] args) {
		Runnable run0=()->{
			
			int i=1;
			while(i<=10)
			{
			System.out.println("Name of Thread:"+Thread.currentThread().getName());
			System.out.println(i+" First Thread");
			i++;
			}
		};
		
Runnable run1=()->{
			
			boolean flag=true;
			while(flag==true)
			{
			System.out.println("Name of Thread:"+Thread.currentThread().getName());
			System.out.println("Second Thread");
			
			flag=false;
			}
};
		
Runnable run2=()->{
			for(int i=0;i<=10;i++)
			{
			System.out.println("Name of Thread:"+Thread.currentThread().getName());
			System.out.println("Third Thread "+i);
			}
		};
		
		ExecutorService ex=Executors.newFixedThreadPool(3);
		
		ex.execute(run0);
		ex.execute(run1);
		ex.execute(run2);
		
		ex.shutdown();
		
	}

}
