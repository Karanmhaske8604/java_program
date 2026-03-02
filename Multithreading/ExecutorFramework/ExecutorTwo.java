package java_home.Multithreading.ExecutorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorTwo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
/* B} submit()->1>Callable<Task>
 * 			  ->2>Runnable(Task)
 * 			  ->3>Runnable(Task,Default value)		
 */
		
		ExecutorService ex=Executors.newFixedThreadPool(3);

		Callable<String> call1=()->("Hello");
		Callable<String> call2=()->("Hello");
		Callable<String> call3=()->("Hello");
		
		Future<?> f=ex.submit(call1);
		Future<?> fu=ex.submit(()->{System.out.println("Second Way");});
		Future<?>ft=ex.submit(()->{System.out.println("third way");},"Default Value");
		
		
;		ex.shutdown();
		System.out.println(f.get());
		System.out.println(fu.get());
		System.out.println(ft.get());
	}

}
