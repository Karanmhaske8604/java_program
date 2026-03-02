package java_home;

public class Class_Varibles {

	public static void main(String[] args) {
		//classname  object=new classname();
		  Aeroplane  boeing=new Aeroplane();
		  boeing.Name="Abc1543";//value Assign
		  boeing.Num=145863;
		  boeing.fly();  //call to the method
		  System.out.println(boeing.Name);//call to object
		  System.out.println(boeing.Num);
		  
		  Aeroplane indigo=new Aeroplane();
		  indigo.Name="Xyz16333";
		  indigo.Num=793563;
		  indigo.fly();
		  System.out.println(indigo.Name);
		  System.out.println(indigo.Num);
		  System.out.println("we have done it....");

	}

}

class Aeroplane
{
	String Name;//Instance Variable.global access of the variables.
	int Num;//Instance varible
	
	//[modifier] returntype methodname
	public void fly()
	{
		int pilots=2;//local varible
		System.out.println("No. of the pilots "+pilots);//local variable access only on the method.
		System.out.println("The Plane is successfully takeoff");
	}
}
