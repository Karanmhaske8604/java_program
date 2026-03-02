package java_home.Multithreading;

public class VolatileKwx {

	public static void main(String[] args) throws InterruptedException {
		
		Test t=new Test();
		t.start();
		t.sleep(1000);
		
		t.keepRunning=false;
		System.out.println("keepRunning is false ");
		
	}
}

class Test extends Thread {

   volatile boolean keepRunning = true;

    public void run() {
        while (keepRunning) 
        {
        	
        }
        System.out.println("Thread is finish.");
    }
}