package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorThree {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService ex=Executors.newSingleThreadExecutor();
		
		Callable <String> call=()->{
			
			Thread.sleep(2500);
			return new String("Hello its me");
		};

		Callable <String> call2=()->{
			Thread.sleep(4500);
			
			return new String("Hi i mam");
		};
		
		Callable <String> call3=()->{
			
			Thread.sleep(3500);
			return new String("hello guys");
		};
		
		Future<?>f=ex.submit(call);
		
		Future<?>f2=ex.submit(call2);
		Future<?>f3=ex.submit(call3);
		
		
		System.out.println(f.get());
		System.out.println(f2.get());
		System.out.println(f3.get());

	}

}
