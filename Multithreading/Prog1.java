package java_home.Multithreading;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException {
		Aone t1=new Aone("Covid19",10);
		Aone t2=new Aone("Lockdown2020",20);
		Aone t3=new Aone("Vaccinated",30);
		
		/*
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


