package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorEight {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		Runnable run = () -> {
			System.out.println("" + Thread.currentThread().getName());
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
			}
		};

		try (
		ExecutorService ex=Executors.newCachedThreadPool();
			)
		{
		 Future<?> ft=ex.submit(run); 
		System.out.println(ft.get());//return NULL
		  
		Future<String> ft2=ex.submit(run,"HIII"); //return default value
		 System.out.println(ft2.get());
		}
		
		  //ex.shutdown();
		
	}
	}


