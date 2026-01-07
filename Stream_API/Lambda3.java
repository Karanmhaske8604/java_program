package java_home.Stream_API;

public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addd<Integer,String> ad=(i1,i2,i3)->{
			return (i1+i2+i3+"Hellooo");
			//return new StringBuffer("Helooo").append(i1+i2+i3).toString();
		};
		String Display=ad.add(54, 78, 36);
		System.out.println(Display);
	}

}

interface Addd<T,R>
{
	R add(T t1,T t2, T t3);
}
