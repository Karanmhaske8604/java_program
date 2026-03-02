package java_home.Multithreading;

public class ThreadMethods {
	
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();
		System.out.println("Thread Name:"+t.currentThread());
		t.setName("MyThread");
		System.out.println("New Name:"+t.getName());
		t.setPriority(10);
		System.out.println("The Priority is :"+t.getPriority());
		
		
	}

}
