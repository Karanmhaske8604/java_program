package java_home.Stream_API.Functinal_interfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer1 {

	public static void main(String[] args) {
		List<Integer> Number=Arrays.asList(1,2,3,4,5,5,6,6,7,8,5,8,9);
		
		Consumer<Integer>  cons=(i)->{
			System.out.println(i);
		};
		System.out.println("Priting by Lambda Function..");
		
		 for(int i : Number ) { System.out.println(i); }
		 
		System.out.println("@@@@@@@@@@@@@@");
		Number.forEach(cons);
		 
		Consumer con=System.out::println;
		System.out.println("Printing as Method Reference."); 
		Number.forEach(con);
		
	}

}
