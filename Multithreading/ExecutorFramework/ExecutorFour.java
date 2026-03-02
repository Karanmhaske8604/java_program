package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFour {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService ex=Executors.newFixedThreadPool(2);
		
		Callable<Integer> call=()->{
			
			for(int i=0;i<10;i++)
			{
			return i*5 ;
			}
			return null;
		};
		
      Callable<Integer> calle=()->{
			
			for(int i=0;i<10;i++)
			{
			return i*5 ;
			}
			return null;
		};

		Future<?> f=ex.submit(call);
		Future<?> f1=ex.submit(calle);
		System.out.println(f.get());
		System.out.println(f1.get());
		
		
	}

}
