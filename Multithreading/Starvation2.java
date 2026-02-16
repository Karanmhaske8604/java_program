package java_home.Multithreading;

public class Starvation2 {

	public static void main(String[] args) {
		
		Thread t1=new Thread(()->{
			int age=10;
			while(true)
			{
				while(age>15)
				{
				System.out.println("You can swim");
				}
				System.out.println("You are Minor");
			}
		});
		
		Thread t2=new Thread(()->{
			int age=19;
			while(true)
			{
				if(age>=18)
				{
					System.out.println("Yes,you can vote..");
				}
				else
				{
					System.out.println("Sorry,you can't...");
				}
			}
		});
		
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();

	}

}
