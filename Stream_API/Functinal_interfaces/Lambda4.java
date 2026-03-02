package java_home.Stream_API.Functinal_interfaces;

public class Lambda4 {

	public static void main(String[] args) {
		checknum<Integer> ck=(i)->{
			return  (i%2==0); 
		};
		System.out.println(ck.check(8888));
		}

	}

interface checknum<Integer>
{
	boolean check(int i);
}
