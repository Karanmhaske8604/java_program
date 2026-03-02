package java_home.Oops;

public class MethodOverloading {
     //Static polymorphism ,Compiled time polymorphism,
	public static void main(String[] args) {
		Bird b=new Bird(1,2);
		b.fly();
		b.fly(1,"hey");
		b.fly("Hi", 0);

	}

}

class Bird
{
	public Bird(int i,int j)
	{
		System.out.println("hey");
	}

	public void fly()
	{
		System.out.println("First fly");
	}
	
	public void fly(int a ,String s)
	{
		System.out.println("Second fly");
	}
	
/*	public int fly(int a,String s)   //Method return type doesn`t make method different.
	{                               //It depend on Signature of the method i.e No. of parameters,type of parameters and sequence of parameter
		return 1;
	}*/
	public void fly(String s,int a)
	{
		System.out.println("Third fly");
	}
}
