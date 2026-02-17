package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorEleven {

	public static void main(String[] args) throws  ExecutionException, InterruptedException {
		
      //Submit()=>Callable<V>=>Future<V>=>get()
		
		try(
		
		ExecutorService ex=Executors.newCachedThreadPool();
		)
		{
				
		Future<String> f=ex.submit(()->{
			return new String("Karan");
		});
		
		Future<String> f1=ex.submit(()->{
			return new String("VAsudev");
		});
		Future<String> f2=ex.submit(()->{
			return new String("Mhaske");
		});
		
		
		System.out.println(f.get());
		System.out.println(f1.get());
		System.out.println(f2.get());
		}
		//ex.shutdown();
		

	}

}
