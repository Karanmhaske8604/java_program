package java_home.Multithreading;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		/*Program to define a thread for printing text on output screen for ‘n’ number of 
        times. Create 3 threads and run them. Pass the text ‘n’ parameters to the thread constructor.
 Example:
 i. First thread prints “COVID19” 10 times.
 ii. Second thread prints “LOCKDOWN2020” 20 times
 iii. Third thread prints “VACCINATED2021” 30 times		 */
		
		Aone t1=new Aone("Covid19",10);
		Aone t2=new Aone("Lockdown2020",20);
		Aone t3=new Aone("Vaccinated",30);
		
		/*depends on OS work in linux.
		 * t1.setPriority(10); t2.setPriority(5); t3.setPriority(1);
		 */
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}

}

class Aone extends Thread
{

	String name;
	int n;
	
	public Aone(String name,int n)
	{
		this.name=name;
		this.n=n;
	}
	
	public void run()
	{
		for(int i=1;i<n;i++)
		{
			System.out.println(getName()+":"+name);
		}
	}

}


