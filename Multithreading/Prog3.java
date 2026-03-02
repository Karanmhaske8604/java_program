package java_home.Multithreading;

import java.util.Random;

public class Prog3 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Sum_Avg t1=new Sum_Avg("t1",1);
	 t1;

	}

}

class Sum_Avg implements Runnable
{
	int a[]=new int [1000];
	int no,sum;
		
	Sum_Avg(String s,int n)
	{
		Random r=new Random();
		Thread t=new Thread(this,s);
		int j=0;
		for(int i=0;i<100;i++)
		{
			a[i]=r.nextInt(100);
			j++;
		}
		t.start();
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println(a[no]+"");
			sum+=sum+a[no];
			no++;
		}
		System.out.println("");
		System.out.println("SUM:"+sum);
		System.out.println("AVG:"+sum/10);
		System.out.println("");
		
	}
	
}
