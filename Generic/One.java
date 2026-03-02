package java_home.Generic;

public class One {

	public static void main(String[] args) {
		 Objectadder <String> you=new Objectadder<String>();
		 you.add("45","65");
		 System.out.println(you.getinstance("karanmhaske"));

	}

}

interface Iadd<A>
{
  void add (A a1, A a2);	
}

class Objectadder<A> implements Iadd<A> 
{
 public void add( A a1, A a2)
 {
	 if (a1 instanceof Integer && a2 instanceof Integer)
	 {
		 int i=(int)a1;
		 int j=(int)a2;
		 System.out.println(i+j);
	 }
	 else if(a1 instanceof String && a2 instanceof String)
	 {
		 String s1=(String)a1;
		 String s2=(String)a2;
		 System.out.println("String is found "+s1+" "+s2);
	 }
 }
 
 public int getinstance(A a) {
	 if(a instanceof String) {
		 return ((String)a).length();
	 }
	 return 0;
	 
 }
}