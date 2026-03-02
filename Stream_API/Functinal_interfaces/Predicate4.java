package java_home.Stream_API.Functinal_interfaces;

import java.util.function.Predicate;

public class Predicate4 {

	public static void main(String[] args) {
	Predicate<Integer> prds=(i)->{
		System.out.println("A");
		return i.toString().startsWith("1");
	};
	
	Predicate<Integer> prd2=(i)->{
		System.out.println();
		return i>100;
	};
    Predicate<Integer> pd3= prds.and(prd2);//.and method behave like Ligical AND T-T=T;T->F=F;
    System.out.println(pd3.test(102));
    
    Predicate<Integer> Pd4=pd3.negate();//.negate method changes output in oppose.
    System.out.println(Pd4.test(102));
}
}


