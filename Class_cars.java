package java_home;

public class Class_cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bk=new Car();
			
		bk.name="Starcity";
		bk.type="Two-Wheeler";
		bk.price=89999.25;
		bk.Fun();
		
		Car ar=new Car();
		ar.name="Honda_Verna";
		ar.type="Four_Wheeler";
		ar.price=10000.55;
		ar.Fun();
		System.out.println("Name of bike company "+ar.name);
        System.out.println(bk.name);

	}
		
}
class Car{
	String name;
	String type;
	double price;
	
	public void Fun()
	{
		String str="Welcome to family..";
		System.out.println(str);
		System.out.println("Name of bike company "+name);
		System.out.println("Type of bike "+type);
		System.out.println("Price "+price);
		System.out.println();	
		}
	}