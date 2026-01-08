package java_home.Stream_API.Functinal_interfaces;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1 {

	public static void main(String[] args) {
		List<Integer> Num=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Predicate <Integer> Even=(i)->{
			return i%2==0;};
			
			Num=Num.stream().filter(Even).toList();
			System.out.println(Num);
	}

}
