package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorSeven {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Callable()=>call()=>submit()=>Future<T>

		//try with resources
		Callable <String> str=()->{
			return new String("Hello");
		};
		
		try (
				ExecutorService ex=Executors.newCachedThreadPool();
		    )
		
		{
			
		Future<String> f=ex.submit(str);
		System.out.println(f.get());		
	    }
}
}
