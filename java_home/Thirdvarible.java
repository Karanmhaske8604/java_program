package java_home;

public class Thirdvarible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 City c=new City();
		 c.id=101;
		 c.name="shirur";
		 c.pincode="412210";//1st / 2nd time value assign.
		 
		 City d=new City();
		 d.id=102;
		 d.name="parner";
		 d.pincode="413702";//last time value assign to static varible.
		 
    c.display();
	d.display();
	/*System.out.println(c.pincode);
		 
		 System.out.println(d.pincode);*/
		 //static varible value don't copy,share only.
		 //if we assign value in class then also ast updated value will be print.
	 }

}
class City
{
 int id;
 String name;
 static String pincode="415263";
 
 public void display()
 {
System.out.println(id);
 System.out.println(name);
 System.out.println(pincode);
 System.out.println();
  
 }
}
